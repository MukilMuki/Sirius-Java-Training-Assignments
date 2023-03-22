package day_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise9 {
	public static void main(String args[]) {
		int flag = 0;
		String inputString;
		int parsedInput;
		int sum = 0;
		System.out.println("Enter the marks of 10 students");
		while (flag < 10) {
			try {
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter the Mark of student no:" + (flag + 1));
				inputString = scan.nextLine();
				parsedInput = Integer.parseInt(inputString);
				if (parsedInput < 0) {
					throw new NegativeValueException("Negative Values");
				}
				if (parsedInput > 100) {
					throw new OutofRangeException("The Mark range should be inbetween 0-100");
				}
				sum += parsedInput;
				flag++;
			} catch (NegativeValueException e) {
				System.out.println(e.getMessage());
			} catch (OutofRangeException e) {
				System.out.println(e.getMessage());
			} catch (NumberFormatException e) {
				System.out.println("Please enter a proper value!");
			}
		}
		System.out.println("The average of marks of 10 Students is:" + sum / 10);
	}
}

class NegativeValueException extends Exception {

	NegativeValueException(String message) {
		super(message);
	}
}

class OutofRangeException extends Exception {

	OutofRangeException(String message) {
		super(message);
	}
}
