package day_5;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * <p>
 * Flyweight design pattern is used when we need to create a lot of Objects of a
 * class. Since every object consumes memory space that can be crucial for low
 * memory devices, such as mobile devices or embedded systems, flyweight design
 * pattern can be applied to reduce the load on memory by sharing objects.
 * </p>
 * 
 * @author mukilan
 */

interface Drone {
	public void navigation(int lateral, int vertical, int longitudes, int newLateral, int newVertical,
			int newLongitudes);
}

/**
 * Interface Implementation that gets the intrinsic properties
 */
class DroneInstance implements Drone {

	private Object droneType;

	@Override
	public void navigation(int lateral, int vertical, int longitudes, int newLateral, int newVertical,
			int newLongitudes) {

	}
}

/**
 * Factory that creates one object to be used for all instances as each object
 * creation is expensive.
 */
class DroneFactory {
	private static Drone drone;

	public static Drone getDrone() {
		if (drone == null) {
			drone = new DroneInstance();
		}
		return drone;
	}
}

/**
 * Client that consumes the flyweight implementation while getting extrinsic
 * properties from user to use.
 */
class DroneStrike {
	private Drone drone = DroneFactory.getDrone();
	int currentLateral = 0;
	int currentVertical = 0;
	int currentLongitudes = 0;

	public void navigation(int newLateral, int newVertical, int newLongitudes) { // TODO Auto-generated method stub
		drone.navigation(currentLateral, currentVertical, currentLongitudes, newLateral, newVertical, newLongitudes);
		currentLateral = newLateral;
		currentVertical = newVertical;
		currentLongitudes = newLongitudes;
		System.out.println("Target locked on at:" + currentLateral + " " + currentVertical + " " + currentLongitudes);
	}

}

public class FlyweightPattern {
	public static void main(String args[]) {
		try (Scanner scan = new Scanner(System.in)) {
			int targetLateral, targetVertical, targetLongitude;
			DroneStrike controlRoom[] = { new DroneStrike(), new DroneStrike() };
			int strikes = controlRoom.length;
			while (strikes > 0) {
				System.out.println("Enter the Lateral");
				targetLateral = scan.nextInt();
				System.out.println("Enter the Vertical");
				targetVertical = scan.nextInt();
				System.out.println("Enter the Longitude");
				targetLongitude = scan.nextInt();
				controlRoom[strikes - 1].navigation(targetLateral, targetVertical, targetLongitude);
				strikes--;
				System.out.println("Target Destroyed......");
			}
		} catch (InputMismatchException e) {
			System.out.println("Please enter an integer value!");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
