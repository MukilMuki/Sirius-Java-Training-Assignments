package day_2;

import java.util.Scanner;

public class Exercise7 {
	public static void main(String args[]) {
		int i = 0;
		String numerator;
		int checkedNumerator;
		String divisor;
		int checkedDivisor;
		int result;
		Scanner sc = new Scanner(System.in);
		while (i == 0) {
			checkedNumerator=numeratorCheck();
			checkedDivisor=divisorCheck();
			System.out.println("The result is:"+checkedNumerator/checkedDivisor);
		}
	}

	static int numeratorCheck() {
		int i = 0;
		String numerator;
		int parsedNumerator;
		while (i == 0) {
			Scanner sc = new Scanner(System.in);
			try {
				System.out.println("Enter the numerator");
				numerator = sc.nextLine();
				if(numerator.equals("q")||numerator.equals("Q"))
					System.exit(0);
				parsedNumerator =Integer.parseInt(numerator);
				return parsedNumerator;
			} catch (NumberFormatException e) {
				System.out.println("Please enter an Integer!");
			} catch (ArithmeticException e) {
				System.out.println("Divide by zero is not possible!");
			}
		}
		return 0;
	}

	static int divisorCheck() {
		int i = 0;
		String divisor;
		int parsedDivisor;
		while (i == 0) {
			Scanner sc = new Scanner(System.in);
			try {
				System.out.println("Enter the divisor");
				divisor = sc.nextLine();
				if(divisor.equals("q")||divisor.equals("Q"))
					System.exit(0);
				parsedDivisor =Integer.parseInt(divisor);
				return parsedDivisor;
			} catch (NumberFormatException e) {
				System.out.println("Please enter an Integer!");
			} catch (ArithmeticException e) {
				System.out.println("Divide by zero is not possible!");
			}
		}
		return 0;
	}
}
