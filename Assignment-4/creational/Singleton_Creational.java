package day_4.creational;

import day_4.creational.MySingleTon;

public class Singleton_Creational {
	public static void main(String[] args) {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				MySingleTon.createInstance();
				
			}
		}).start();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				MySingleTon.createInstance();
				//The second thread cant create another object instance because the first
				//thread already created one
				
			}
		}).start();
	}
}
class MySingleTon{
	private MySingleTon() {
		System.out.println("singleton object created...");
	}
	private static MySingleTon obj;
	synchronized public static MySingleTon createInstance() {
		if(obj==null) {
			obj=new MySingleTon();
		}
		return obj;
	}
}