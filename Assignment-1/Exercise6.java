package day_1;

import java.util.Scanner;

public class Exercise6 {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		int userInput;
		System.out.println("Enter a number");
		userInput=scan.nextInt();
		if (isArmstrong(userInput))
			System.out.println(userInput+" is a Armstrong number");
		else if (isPalindrome(userInput))
			System.out.println(userInput+" is a Palindrome number");
		else if (isPerfect(userInput))
			System.out.println(userInput + " is a perfect number");
		else 
			System.out.println("Neither Palindrome nor Armstrong nor Perfect");	
		
		System.out.println("Enter the range of prime numbers");
        int n = scan.nextInt();
		System.out.println("The elements that are prime from 1-"+n+" are:");
        System.out.print("Following are the prime numbers ");
        System.out.println("smaller than or equal to " + n);
        SieveOfEratosthenes checkPrime = new SieveOfEratosthenes();
        checkPrime.sieveOfEratosthenes(n);		
	}
	
	static boolean isArmstrong(int checkNumber) {
		int reminder,reverse=0;
		int baseNumber=checkNumber;
		int power = String.valueOf(baseNumber).length();
		while(baseNumber>0) {
	        reminder = baseNumber%10;
	        reverse += Math.pow(reminder, power) ;
	        baseNumber = baseNumber/10;
	      }
		if (reverse==checkNumber)
			return true;
		else
			return false;
	}
	
	static boolean isPalindrome(int checkNumber) {
		int reminder,reverse=0;
		int baseNumber=checkNumber;
		while(baseNumber>0){
			reminder = baseNumber%10;
			reverse = (reverse*10) +reminder;
			baseNumber = baseNumber/10;
	      }
		if(reverse==checkNumber)
			return true;
		else 
			return false;
	}
	
	static boolean isPerfect(int checkNumber)
	{
			if (checkNumber == 1)
				return false;
			int sum = 1;
			for (int i = 2; i < checkNumber; i++) {
				if (checkNumber % i == 0) {
					sum += i;
				}
			}
			if (sum == checkNumber)
				return true;
			else
				return false;
	}

}

class SieveOfEratosthenes
{
    void sieveOfEratosthenes(int n)
    {
        boolean prime[] = new boolean[n+1];
        for(int i=0;i<=n;i++)
            prime[i] = true;
         
        for(int p = 2; p*p <=n; p++)
        {
            if(prime[p] == true)
            {
                for(int i = p*p; i <= n; i += p)
                    prime[i] = false;
            }
        }
         
        for(int i = 2; i <= n; i++)
        {
            if(prime[i] == true)
                System.out.print(i + " ");
        }
    }
}