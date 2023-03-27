package day_3;

import java.util.Scanner;
import java.util.Stack;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exercise3 {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		InventorySystem inventoryAccess=new InventorySystem();
		String product=scan.nextLine();
		ExecutorService es= Executors.newFixedThreadPool(2);
		es.execute(()->{
			Thread.currentThread().setName("Producer");
			inventoryAccess.produceProduct(product);
			inventoryAccess.produceProduct(product);
		});
		
		es.execute(()->{
			Thread.currentThread().setName("Consumer");
			inventoryAccess.consumeProduct();
			inventoryAccess.consumeProduct();
		});
		
		es.shutdown();
	}
}

class InventorySystem{
	
	Stack <String> inventory=new Stack<String>();
	synchronized public void produceProduct(String product) {
		if(inventory.size()>=1)
			System.out.println("The inventory already has a maximum of 1 product");
		else {
			inventory.push(product);
			System.out.println("The Producer produced the product:"+inventory);
		}
	}
	
	synchronized public void consumeProduct() {
		if(inventory.size()<=0)
			System.out.println("The inventory is empty");
		else {
			System.out.println("The Consumer consumed the product:"+inventory);
			inventory.pop();
		}
	}
}
