package day_3;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exercise4 {

	public static void digitalClock() {
		ExecutorService es = Executors.newFixedThreadPool(3);
		Calendar calender = Calendar.getInstance();
		try {
			es.execute(() -> {
				int hours = calender.get(Calendar.HOUR_OF_DAY);
				if (hours > 12)
					hours -= 12;
				System.out.print(hours);
			});
			es.execute(() -> {
				int minutes = calender.get(Calendar.MINUTE);
				System.out.print(":" + minutes + ":");
			});

			es.execute(() -> {
				int seconds = calender.get(Calendar.SECOND);
				System.out.println(seconds + "\n\n\n\n\n\n\n\n\n\n\n\n\n");
			});
			es.shutdown();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public static void main(String args[]) {
		int i = 0;
		while (i == 0) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			digitalClock();
		}
	}
}
