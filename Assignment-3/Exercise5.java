package day_3;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exercise5 {
	public static void main(String args[]) {
		ExecutorService ex = Executors.newFixedThreadPool(1);
		ex.execute(() -> {
			Thread.currentThread().start();
		});
		ex.shutdown();
	}
}
