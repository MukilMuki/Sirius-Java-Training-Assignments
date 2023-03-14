package day_2;

public class Exercise2{
	public void mth1(){
		mth2();
		System.out.println("caller");
	}
	
	public void mth2() {
		try {
			new Exercise2();
			return;
		}
		catch(Exception e) {
			System.out.println("catch-mth2");
		}
		finally {
			System.out.println("Finally mth2");
		}
	}
		public static void main(String args[]) {
			Exercise2 s=new Exercise2();
			s.mth1();
		}
	}