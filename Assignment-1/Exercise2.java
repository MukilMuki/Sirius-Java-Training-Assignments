package day_1_modified;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

interface stack{
	void pushele(int ele);
	void popele();
}

public class Exercise2 {
	public  static void main(String args[]) {
		FixedStack fs=new FixedStack();
		DynamicStack ds = new DynamicStack();
		System.out.println("Dynamic Stack");
		ds.pushele(50);
		ds.popele();
		System.out.println("Fixed Stack");
		fs.pushele(9);
		fs.popele();
	}
}

class DynamicStack implements stack{
	Scanner sc=new Scanner(System.in);
	Stack<Integer> stk= new Stack<Integer>();
	@Override
	public void pushele(int ele) {
		// TODO Auto-generated method stub
		stk.push(ele);
		System.out.println(stk);
	}

	@Override
	public void popele() {
		// TODO Auto-generated method stub
		stk.pop();
		System.out.println(stk);
	}
	
}

class FixedStack implements stack{
	Scanner sc=new Scanner(System.in);
	int arr[]= {1,2,3,4,5};
	@Override
	public void pushele(int ele) {
		// TODO Auto-generated method stub
		int addArray[]= Arrays.copyOf(arr, arr.length+1);
		addArray[arr.length]=ele;
		System.out.println("Elements after pushing");
		for(int b:addArray)
			System.out.println(b);
	}

	@Override
	public void popele() {
		// TODO Auto-generated method stub
		int removeArray[]=Arrays.copyOf(arr,arr.length-1);
		System.out.println("Elements after popping");
		for(int c:removeArray)
			System.out.println(c);
		
	}
	
}


