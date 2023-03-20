package day_3;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exercise1 {
	public static void main(String args[]) {
		ExecutorService es=Executors.newFixedThreadPool(2);
		es.execute(()->{
			for(int i=0;i<=100;i=i+2) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(i);
			}
				
	});
		es.execute(()->{
			for(int i=1;i<100;i=i+2) {
				try {
					Thread.sleep(101);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(i);
			}
	});
		es.shutdown();
	}
}
