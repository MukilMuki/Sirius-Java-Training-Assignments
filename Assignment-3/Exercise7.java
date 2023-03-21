package day_3;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exercise7 {
	public static void main(String args[]) {
		ExecutorService es=Executors.newFixedThreadPool(2);
		es.execute(()->{
			for(int i=1;i<=100;i++) {
				try {
					Thread.sleep(1000);
					System.out.println(i);
					if(i%10==0)
						System.out.println("hi");
						
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
				
	});
		es.shutdown();
	}
}
