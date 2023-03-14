package day_1_modified;

public class Exercise6 {
	public static void main(String args[]) {
		int arms,palin, numbe=50;
		arms = armstrong(numbe);
		palin = palindrome(numbe);
		if(arms==numbe)
			System.out.println("Given number is Armstrong");
		else if(palin==numbe)
			System.out.println("Given number is Palindrome");
		else 
			System.out.println("Neither Palindrome nor Armstrong");
		System.out.println("The elements that are prime from 1-100 are:");
		for(int i=0;i<100;i++)
			prime(i);
	}
	
	static int prime(int primenum) {
		int flag=0;
		for(int i=1;i<primenum;i++) {
		if(primenum%i==0)
			flag++;
		}
		if(flag==1)
			System.out.println(primenum);
	return 0;
}             
	static int armstrong(int num) {
		int rem,rev=0;
		while(num>0){
	          
	        rem = num%10;
	        rev += Math.pow(rem,3) ;
	        num = num/10;
	      }
		return rev;
		
	}
	
	static int palindrome(int num) {
		int rem,rev=0;
		while(num>0){
	          
	        rem = num%10;
	        rev = (rev*10) +rem;
	        num = num/10;
	      }
		return rev;
	}
}