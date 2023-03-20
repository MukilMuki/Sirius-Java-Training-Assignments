package day_2;

import java.util.Scanner;

public class Exercise9 {
	public static void main(String args[]){
		int a,b = 0,c,i,j=0;
		while(j==0) {
			try {
				Scanner scan= new Scanner(System.in);
				System.out.println("Enter the marks of 10 students");
				for(i=0;i<10;i++) {
					a=scan.nextInt();
					if(a<0)
						throw new CustomExceptionCheck("Negative Values");
					if(a>100)
						throw new CustomExceptionCheck("The Mark range should be inbetween 0-100");
					b+=a;
				}
					c=b/10;
					System.out.println(c);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}

class CustomExceptionCheck extends Exception{
	
	CustomExceptionCheck(String message){
		super(message);
	}
}

