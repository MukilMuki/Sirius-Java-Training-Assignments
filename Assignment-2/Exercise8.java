package day_2;

import java.util.Scanner;

public class Exercise8 {
	public static void main(String args[]) {
		int a,b = 0,c,i,j=0;
		while(j==0) {
			try {
				Scanner scan= new Scanner(System.in);
				System.out.println("Enter the marks of 10 students");
				for(i=0;i<10;i++) {
					a=scan.nextInt();
					b+=a;
				}
					c=b/10;
					System.out.println(c);
			}
			catch(Exception e){
				System.out.println("Enter Correct value");
				System.out.println(e);
			}
		}
	}
}

