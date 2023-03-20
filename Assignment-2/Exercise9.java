package day_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise9 {
	public static void main(String args[]){
		int b = 0,c,i = 0,j=0;
		int a[]=new int[10];
		int sum=0;
		System.out.println("Enter the marks of 10 students");
		while(i<10) {
			try {
				Scanner scan= new Scanner(System.in);
					a[i]=scan.nextInt();
					if(a[i]<0) {
						throw new NegativeValueException("Negative Values");
					}
					if(a[i]>100) {
						throw new OutofRangeException("The Mark range should be inbetween 0-100");
					}
					System.out.println(i);
				i++;
			}
			catch(NegativeValueException e) {
				System.out.println(e.getMessage());
			}
			catch(OutofRangeException e) {
				System.out.println(e.getMessage());
			}
			catch(InputMismatchException e){
				System.out.println("Enter Correct value");
			}
		}
		for(int value:a)
			sum+=value;
		System.out.println(sum);
	}
}

class NegativeValueException extends Exception{
	
	NegativeValueException(String message){
		super(message);
	}
}

class OutofRangeException extends Exception{
	
	OutofRangeException(String message){
		super(message);
	}
}

