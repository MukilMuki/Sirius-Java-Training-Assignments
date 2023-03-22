package day_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise7a {
	public static void main(String args[]) {
		int i=0;
		int numerator;
		int divisor;
		while(i==0) {
			try {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the numerator");
				numerator=sc.nextInt();
				System.out.println("Enter the divisor");
				divisor=sc.nextInt();
				System.out.println(numerator/divisor);
			}
			catch(InputMismatchException e){
				System.out.println("Please enter an Integer");
			}
			catch(ArithmeticException e) {
				System.out.println("Divide by zero is not possible");
			}
		}
	}
}
