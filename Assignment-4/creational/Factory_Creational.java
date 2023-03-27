package day_4.creational;

import java.util.Scanner;

interface EmergencyBroadcast{
	void alert();
}

class HurricaneAlert implements EmergencyBroadcast{
	public void alert() {
		System.out.println("There is a Hurricane incoming! Please evacuate immediately");
	}
}

class TsunamiAlert implements EmergencyBroadcast{
	public void alert() {
		System.out.println("Tsunami incoming. Please head to the nearest shelter for evacuation"
				+ " or head to the high ground!");
	}
}

class EarthquakeAlert implements EmergencyBroadcast{
	public void alert() {
		System.out.println("An Earthquake is happening right now! Please evacuate the building "
				+ "or stay under a stable obstacle and wait for help!");
	}
}

class EmergencyBroadcastFactory{
	public EmergencyBroadcast createEmergencyBroadcst(String alert) throws Exception {
		switch(alert) {
	
			case "Tsunami":
				return new TsunamiAlert();
		
			case "Hurricane":
				return new HurricaneAlert();
			
			case "Earthquake":
				return new EarthquakeAlert();
			
			default: 
				throw new Exception("Please send a proper response to have an immediate effect."
						+ "If it is found to be a hoax, you will be apprehended by the authorities!");
		}
	}
}
public class Factory_Creational {
	public static void main(String args[]) throws Exception {
		Scanner scan=new Scanner(System.in);
		EmergencyBroadcastFactory emergencyBroadcastFactory= new EmergencyBroadcastFactory();
		String alert=scan.nextLine();
		EmergencyBroadcast emergencyBroadcast= emergencyBroadcastFactory.createEmergencyBroadcst(alert);
		emergencyBroadcast.alert();
	}
}
