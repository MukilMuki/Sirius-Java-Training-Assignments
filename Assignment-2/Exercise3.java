package day_2;

public class Exercise3{
	public void mth1(){
		mth2();
		System.out.println("caller");
	}
	
	public void mth2() {
		try {
			System.exit(0);
		}
		catch(Exception e) {
			System.out.println("catch-mth2");
		}
		finally {
			System.out.println("Finally mth2");
		}
	}
		public static void main(String args[]) {
			Exercise3 s=new Exercise3();
			s.mth1();
		}
	}