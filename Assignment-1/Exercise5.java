package day_1; 

public class Exercise5{
	public static void main(String[] args) {
		SingleTonObjectCreation.createInstance();
}
}
class SingleTonObjectCreation{
	private SingleTonObjectCreation() {
		System.out.println("singleton object created...");
	}
	private static SingleTonObjectCreation secureObject;
	synchronized public static SingleTonObjectCreation createInstance() {
		if(secureObject==null) {
			secureObject=new SingleTonObjectCreation();
		}
		return secureObject;
	}
}