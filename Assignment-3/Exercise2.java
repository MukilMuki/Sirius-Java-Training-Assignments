package day_3;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exercise2 {

	synchronized static void displayMessage(String message) {
		System.out.println("[------" + message + "-------]");
	}

	public static void main(String args[]) {
		ExecutorService es = Executors.newFixedThreadPool(4);
		es.execute(() -> {
			displayMessage("Hi");
		});
		es.execute(() -> {
			displayMessage("Hi Heloo");
		});
		es.execute(() -> {
			displayMessage("How are you?");
		});
		es.execute(() -> {
			displayMessage("Well Fine");
		});
		es.shutdown();
	}

}
