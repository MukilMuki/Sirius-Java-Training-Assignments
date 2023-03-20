package day_2;

public class Exercise6 {
	Exercise6() throws Exception{
	 throw new Exception();
	}
	public static void main(String args[]) throws Exception{
		new SubEx();
	}
}

class SubEx extends Exercise6{
	SubEx() throws Exception{
		try {
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}