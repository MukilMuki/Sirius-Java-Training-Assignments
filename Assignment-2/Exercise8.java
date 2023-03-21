package day_2;

import java.util.Scanner;

public class Exercise8 {
	public static void main(String args[]) {
		int flag = 0;
		String inputString;
		int parsedInput;
		int sum = 0;
		System.out.println("Enter the marks of 10 students");
		while (flag < 10) {
			try {
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter the Mark of student no:"+(flag+1));
				inputString = scan.nextLine();
				parsedInput=Integer.parseInt(inputString);
				sum += parsedInput;
				flag++;
			} catch (NumberFormatException e) {
				System.out.println("Enter Correct value!");
			}
		}
		System.out.println(sum);
	}
}
