package day_5;

/**
 * <p>
 * Bridge Pattern helps a program to decouple an abstraction from its
 * implementation so that the two can vary independently.
 * </p>
 * <p>
 * In this program, we have an abstraction layer called Vehicle and an Interface
 * layer called the workshop layer. These Layers are seperated from each other
 * and provide seperate responsibilities to the class without interfering with
 * each other.
 * </p>
 * 
 * 
 * @author mukilan
 *
 */

abstract class Vehicle {
	protected Workshop rameshWorkshop;
	protected Workshop sureshWorkshop;

	protected Vehicle(Workshop rameshWorkshop, Workshop sureshWorkshop) {
		this.rameshWorkshop = rameshWorkshop;
		this.sureshWorkshop = sureshWorkshop;
	}

	abstract public void manufacture();
}

/**
 * <p>
 * Car and Bike class which uses both the vehicle and workshop layers to achieve
 * inter-operability and functionality. Contains a reference to the vehicle
 * interface.
 * </p>
 */
class Car extends Vehicle {
	public Car(Workshop rameshWorkshop, Workshop sureshWorkshop) {
		super(rameshWorkshop, sureshWorkshop);
	}

	@Override
	public void manufacture() {
		System.out.print("Car ");
		rameshWorkshop.work();
		sureshWorkshop.work();
	}
}

class Bike extends Vehicle {
	public Bike(Workshop rameshWorkshop, Workshop sureshWorkshop) {
		super(rameshWorkshop, sureshWorkshop);
	}

	@Override
	public void manufacture() {
		System.out.print("Bike ");
		rameshWorkshop.work();
		sureshWorkshop.work();
	}
}

/**
 * Workshop interface layer has no effect on the abstract layer. Provides the
 * workshop functionality to the class.
 */
interface Workshop {
	abstract public void work();
}

class Produce implements Workshop {
	@Override
	public void work() {
		System.out.print("Produced");
	}
}

class Assemble implements Workshop {
	@Override
	public void work() {
		System.out.print(" And");
		System.out.println(" Assembled.");
	}
}

public class BridgePattern {
	public static void main(String[] args) {
		Vehicle vehicle1 = new Car(new Produce(), new Assemble());
		vehicle1.manufacture();
		Vehicle vehicle2 = new Bike(new Produce(), new Assemble());
		vehicle2.manufacture();
	}
}
