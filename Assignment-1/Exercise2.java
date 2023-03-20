package day_1;

import java.util.Arrays;
import java.util.Scanner;

interface stack{
	void push(int element);
	void pop();
}

public class Exercise2 {
	public  static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		int element;
		FixedStack fixed=new FixedStack(5);
		DynamicStack dynamic = new DynamicStack(5);
		System.out.println("Enter the length for the Stacks");
		element=scan.nextInt();
		System.out.println("Fixed Stack");
		fixed.push(element);
		fixed.pop();
		System.out.println("Dynamic Stack");
		dynamic.push(element);
		dynamic.pop();
	}
}  

class FixedStack implements stack{
	int arrayLength;
	int fixedStack[]=new int[arrayLength];
	Scanner scan=new Scanner(System.in);
	FixedStack(int arrayLength){
		this.arrayLength=arrayLength;
		int fixedStack[] = new int[arrayLength];
		this.fixedStack=fixedStack;
		System.out.println("Enter the elements for the fixed stack");
		for(int i=0;i<arrayLength;i++) {
			fixedStack[i]=scan.nextInt();
		}
	}

	public void push(int arrayLength) {
		System.out.println("Enter a number to be pushed");
		fixedStack[arrayLength-1]=scan.nextInt();
		System.out.println("The Elements of the fixed stack are:");
		for(int value:fixedStack)
			System.out.println(value);
		
	}
	
	public void pop() {
		System.out.println("Enter a number to be popped");
		fixedStack[arrayLength-1]=0;
		System.out.println("The Elements of the fixed stack are:");
		for(int value:fixedStack)
			System.out.println(value);

	}
	
}

class DynamicStack implements stack{
	Scanner scan=new Scanner(System.in);
	int arrayLength;
	int dynamicStack[]= new int[arrayLength];
	DynamicStack(int arrayLength) {
		this.arrayLength=arrayLength;
		int dynamicStack[] = new int[arrayLength];
		this.dynamicStack=dynamicStack;
		System.out.println("Enter the elements for the Dynamic Stack");
		for(int i=0;i<arrayLength;i++)
			dynamicStack[i]=scan.nextInt();
	}
	public void push(int arrayLength) {

		
		int arrayCopy[]= Arrays.copyOf(dynamicStack, dynamicStack.length+1);
		System.out.println("Enter a number to be pushed");
		arrayCopy[dynamicStack.length]=scan.nextInt();
		System.out.println("Elements of dynamic stack after pushing");
		for(int value:arrayCopy)
			System.out.println(value);
	}

	public void pop() {
		int arrayCopy[]=Arrays.copyOf(dynamicStack,dynamicStack.length);
		System.out.println("Elements of dynamic stack after popping");
		for(int value:arrayCopy)
			System.out.println(value);
	}
	
}


