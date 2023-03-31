package day_6;

import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.time.*;
import java.lang.Exception;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 * <p>
 * Program to calculate the time taken for a vehicle to reach its destination.
 * First we get both the speed at which the vehicle is travelling and the
 * distance it has to cover. Then we get its departure time and date using the
 * time method. Then we parse it together and send it to a function to calculate
 * the arrival time.
 * </p>
 * 
 * @see Date - Object to be used for the calculations.
 * @see Calendar - Object to be used for getting dates,months and hours.
 * @author mukilan
 *
 */
class Destination {
	int totalHours, totalRemainingHours, hoursRemainingInDay, daysRemaining, holiday;
	LocalDateTime dateTime = LocalDateTime.now();
	Calendar calendar = Calendar.getInstance();
	DayOfWeek dayOfWeek = dateTime.getDayOfWeek();
	DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");

	public Destination(LocalDateTime localDate) {
		this.dateTime = localDate;
	}

	/**
	 * Boolean Function to check if the current day of the month is in anyway a
	 * holiday.
	 * <p>
	 * Considers Second Saturdays, Sundays, 1st January, 15th August, 26th January
	 * </p>
	 *
	 * @param holidayDateTime - DateTime Object for the holiday field.
	 * @return True if it is a holiday and false if not.
	 *
	 */
	boolean isHoliday(LocalDateTime holidayDateTime) {
		return (dateTime.getDayOfWeek() == DayOfWeek.SUNDAY
				|| (dateTime.getDayOfWeek() == DayOfWeek.SATURDAY)
						&& (dateTime.getDayOfMonth() > 7 && dateTime.getDayOfMonth() <= 15)
				|| (dateTime.getMonthValue() == 1 && dateTime.getDayOfMonth() == 26)
				|| (dateTime.getMonthValue() == 8 && dateTime.getDayOfMonth() == 15))
				|| (dateTime.getMonthValue() == 1 && dateTime.getDayOfMonth() == 1);
	}

	/**
	 * Void Function to check the arrival date of the vehicle while considering all
	 * variables and constraints.
	 * <p>
	 * * Plus one day if the departure time is after 8 and Minus one day if the
	 * departure is before 8.
	 * </p>
	 * 
	 * @param distance - Distance between vehicle and destination
	 * @param speed    - Speed of the vehicle.
	 */
	void destinationArrival(int distance, int speed) {
		totalHours = distance / speed;
		totalRemainingHours = totalHours % 8;
		hoursRemainingInDay = 24 - dateTime.getHour() - 1;
		if (hoursRemainingInDay < 8)
			System.out.println("Departure Date is:" + dateTime.plusDays(1).format(dateTimeFormat));
		else {
			System.out.println("Departure Date is:" + dateTime.format(dateTimeFormat));
		}

		while ((totalHours / 8 > daysRemaining)) {
			dateTime = dateTime.plusDays(1);

			if (isHoliday(dateTime))
				holiday++;
			daysRemaining++;
		}

		dateTime = dateTime.plusDays(holiday).plusHours(totalRemainingHours);
		System.out.println("Arrival Date is:" + dateTime.format(dateTimeFormat));

	}
}

/**
 * Custom Exception to check for the negative value
 */
class NegativeValueException extends Exception {

	NegativeValueException(String message) {
		super(message);
	}
}

/**
 * Custom Exception to check for zero value
 */
class ZeroValueException extends Exception {

	ZeroValueException(String message) {
		super(message);
	}
}

public class MathProblem {

	public static void main(String args[]) {
		try (Scanner scan = new Scanner(System.in)) {
			int speed;
			int distance;
			LocalTime localTime;
			LocalDate localDate;
			LocalDateTime dateTime;
			System.out.println("Enter the speed of the vehicle");
			speed = scan.nextInt();
			if (speed < 0) {
				scan.close();
				throw new NegativeValueException("The Vehicle can't be moving at a negative speed!");
			}
			System.out.println("Enter the distance to be covered");
			distance = scan.nextInt();
			if (distance <= 0) {
				scan.close();
				throw new ZeroValueException("The destination has to be atleast a kilometer away");
			}
			System.out.println("Enter the date of lorry's departure");
			localDate = LocalDate.parse(scan.next());
			if (localDate.getYear() < 1800) {
				System.out.println("Please enter a proper value for the date!");
				System.exit(0);
			}
			System.out.println("Enter the time of the departure");
			localTime = LocalTime.parse(scan.next());
			dateTime = LocalDateTime.parse(localDate + "T" + localTime);

			Destination destination = new Destination(dateTime);
			destination.destinationArrival(distance, speed);
		} catch (NegativeValueException e) {
			System.out.println(e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println("The vehicle needs to be moving!");
		} catch (ZeroValueException e) {
			System.out.println(e.getMessage());
		} catch (DateTimeParseException e) {
			System.out.println("Enter the date and time in a proper format!");
		}
	}
}