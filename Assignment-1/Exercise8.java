package day_1_modified;

public class Exercise8{
	public static void main(String args[]) {
		
	}
}

interface calcArea{
	void Area(int a);
	void Area(double a);
	static double pi=3.14;
}

interface calcVolume{
	
}

class Shapes implements calcArea,calcVolume{

	@Override
	public void Area(double r) {
		// TODO Auto-generated method stub
		double result=pi*Math.pow(r, 2);
	}

	@Override
	public void Area(int a) {
		// TODO Auto-generated method stub
		int result = (int) Math.pow(a, 2);
	}
	
}