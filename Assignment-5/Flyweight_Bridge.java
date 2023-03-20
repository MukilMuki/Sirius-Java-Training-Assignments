package day_5;

import java.util.Scanner;

interface Drone{
	public void navigation(int lateral, int vertical, int longitudes,
			int newLateral, int newVertical, int newLongitudes);
}

class DroneInstance implements Drone{
	
	private Object droneType;
	@Override
	public void navigation(int lateral, int vertical, int longitudes,
			int newLateral, int newVertical, int newLongitudes) {		// TODO Auto-generated method stub
	
	}
}

class DroneFactory{
	private static Drone drone;
	
	public static Drone getDrone() {
		if(drone==null) {
			drone=new DroneInstance();
		}
		return drone;
	}
}

class droneStrike{
	private Drone drone=DroneFactory.getDrone();
	int currentLateral=0;
	int currentVertical=0;
	int currentLongitudes=0;
	
	
	public void navigation(int newLateral, int newVertical, int newLongitudes) {		// TODO Auto-generated method stub
		drone.navigation(currentLateral, currentVertical, currentLongitudes, newLateral, newVertical, newLongitudes);
		currentLateral=newLateral;
		currentVertical=newVertical;
		currentLongitudes=newLongitudes;
		System.out.println("Target locked on at:"+currentLateral+" "+currentVertical+" "+currentLongitudes);
	}
	
}
public class Flyweight_Bridge {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		int targetLateral,targetVertical,targetLongitude;
		droneStrike controlRoom[]= {new droneStrike(),new droneStrike()};
		int strikes=controlRoom.length;
		while(strikes>0) {
			System.out.println("Enter the Lateral");
			targetLateral=scan.nextInt();
			System.out.println("Enter the Vertical");
			targetVertical=scan.nextInt();
			System.out.println("Enter the Longitude");
			targetLongitude=scan.nextInt();
			controlRoom[strikes-1].navigation(targetLateral,targetVertical,targetLongitude);
			strikes--;
			System.out.println("Target Destroyed......");
		}
		
	}
}
