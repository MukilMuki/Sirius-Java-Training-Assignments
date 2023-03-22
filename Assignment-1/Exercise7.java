package day_1;

public class Exercise7 {
	
	public static void passByValue(boolean a,boolean b) {
		a=true;
		b=true;
		System.out.println("Changed Values:"+a+" "+" "+b);
	}
	
	public static void passByReference(int arrayCopy[]) {
		arrayCopy[0]=10;
		System.out.println(arrayCopy[0]);
	}
	
	public static void main(String args[]) {
		int arrayOriginal[]= {1,2,3,5,4};
		boolean alpha=true;
		boolean beta=false;
		System.out.println("Original Values before pass by value:"+alpha+" , "+beta);
		passByValue(alpha, beta);
		System.out.println("Original Values after pass by value:"+alpha+" , "+beta);//Original Value doesn't get affected
		System.out.println("Array before pass by reference");
		for(int value:arrayOriginal)
			System.out.println(value);
		passByReference(arrayOriginal);
		System.out.println("Array after pass by reference");
		for(int value:arrayOriginal)
			System.out.println(value);
	}
}