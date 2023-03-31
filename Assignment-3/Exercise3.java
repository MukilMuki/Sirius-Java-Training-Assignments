package day_3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class InventorySystem {

	synchronized public void produce() {
		notify();
		try {
			wait();
		} catch (InterruptedException e) {
			System.out.println(e);
		}

		System.out.println("Producer has produced the product");

	}

	synchronized public void consume() {
		notify();
		try {
			wait();
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("Consumer has consumed the product");
	}
}

public class Exercise3 {
	public static void main(String args[]) {
		ExecutorService es = Executors.newFixedThreadPool(2);
		InventorySystem inventorySystem = new InventorySystem();
		es.execute(() -> {
			Thread.currentThread().setName("Producer");
			for (int i = 0; i < 5; i++)
				inventorySystem.produce();
		});

		es.execute(() -> {
			Thread.currentThread().setName("Consumer");
			for (int i = 0; i < 5; i++)
				inventorySystem.consume();
		});
		es.shutdown();
	}
}
