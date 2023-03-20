package day_1;

public class Exercise3 {
	public static void main(String args[]) {
		C c=new C();
	}
}

class A{
	A(){
		System.out.println("This is class A");
	}
}

class B{
	B(){
		System.out.println("This is class B");
	}
}

class C extends A{
	B b=new B();
}