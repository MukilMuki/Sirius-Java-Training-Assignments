package day_1_modified; 

public class Exercise5{
public static void main(String[] args) {
	MySingleTon.createInstance();
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