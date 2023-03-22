package day_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise7b {
	public static void main(String args[]) {
		int i=0;
		String numerator;
		int divisor;
		int num;
		while(i==0) {
			try {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the numerator");
				numerator=sc.nextLine();
				if(numerator.equals("q")||numerator.equals("Q"))
					break;
				System.out.println("Enter the divisor");
				divisor=sc.nextInt();
				num=(int)Double.parseDouble(numerator);
				System.out.println(num/divisor);
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
