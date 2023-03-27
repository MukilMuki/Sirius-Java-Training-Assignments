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
		int i=0;
		ExecutorService es= Executors.newFixedThreadPool(4);
        Calendar calender = Calendar.getInstance(); 
        Date date = calender.getTime();  
	    	try {  
		    	 es.execute(()->{
		    		 int hours = calender.get( Calendar.HOUR_OF_DAY );  
		    		 if ( hours > 12 ) hours -= 12;  
			         System.out.print(hours);
			         
		    	 });
		    	 es.execute(()->{
			            int minutes = calender.get( Calendar.MINUTE );  
			            System.out.print(":"+minutes+":");
		    	 });
		    	 
		    	 es.execute(()->{
			            int seconds = calender.get( Calendar.SECOND );  
			            System.out.println(seconds);
			            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		    	 });
		    	 es.shutdown();	 
	    	}
	      catch (Exception e) { 
	    	  e.printStackTrace();
	    	  }  
  
	}
	public static void main(String args[]) {   
		int i=0;
		while(i==0)
			digitalClock(); 
	}  
}
