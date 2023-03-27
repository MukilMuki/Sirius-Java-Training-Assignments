package day_4.behavioral;
import java.util.Scanner;

public class Visitor_Pattern {
	public static void main(String[] args) throws Exception{
		Child baby=new Child();
		Dog tiger=new Dog();
		baby.playWithDog(tiger, new Ball());
	}
}

abstract class Item{
	public abstract void play();
}

class Stick extends Item{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("I bite you");
//		new DogBiteException();
	}
}

class Ball extends Item{
	public void play() {
		System.out.println("I play with you");
	}
}


class Dog{
	public void play(Item item) throws DogException{
		item.play();
	}
}
class Child{
	public void playWithDog(Dog dog,Item item) throws DogException {
		try {
		dog.play(item);
	}
		catch(DogException d){
			d.printStackTrace();
			d.Excep();
		}

		}
}
class Handler911{
	public void handle(DogBiteException dbe) {
		System.out.println("take the child to hospital......ambulance on the way...");
	}
	public void handle(DogPlayException dpe) {
		System.out.println("enjoy........................");
	}
	public void handle(DogBarkException dpe) {
		System.out.println("dont throw stones...it will not bark........................");
	}
}

abstract class DogException extends Exception{
	String msg;
	public abstract void Excep();
}
class DogBiteException extends DogException{
	
	public DogBiteException(String msg) {
		this.msg=msg;
	}
	@Override
	public String toString() {
		return "Exception is..............:"+this.msg;
	}
	@Override
	public void Excep() {
		new Handler911().handle(this);
	}
}
class DogPlayException extends DogException{
	public DogPlayException(String msg) {
		this.msg=msg;
	}
	@Override
	public String toString() {
		return "Exception is..............:"+this.msg;
	}
	@Override
	public void Excep() {
		new Handler911().handle(this);
	}
}
class DogBarkException extends DogException{
	public DogBarkException(String msg) {
		this.msg=msg;
	}
	@Override
	public String toString() {
		return "Exception is..............:"+this.msg;
	}
	@Override
	public void Excep() {
		new Handler911().handle(this);
	}
}