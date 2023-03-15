package day_1_modified;

public class Exercise8{
	public static void main(String args[]) {
		Circle c=new Circle();
		Square s=new Square();
		Triangle t=new Triangle();
		Sphere sp=new Sphere();
		Cuboid cb=new Cuboid();
		System.out.println("Area of Circle:"+c.area(10));
		System.out.println("Area of Square:"+s.area(10));
		System.out.println("Area of Triangle:"+t.area(3,5));
		System.out.println("Area of Sphere:"+sp.area(5)+"Volume of Sphere:"+sp.volume(10));
		System.out.println("Area of Cuboid:"+cb.area(5,6,7)+"Volume of Cuboid:"+cb.volume(10,11,12));
	}
}

interface CalcArea{
	double area(double radius);
	double area(double length,double breadth);
	double area(double length, double breadth, double height);
	static double pi=3.14;
}

interface CalcVolume{
	double volume(double radius);
	double volume(double length,double breadth, double height);
}


class Circle implements CalcArea{
	
		public double area(double radius) {
		// TODO Auto-generated method stub
			double result = 3.14*Math.pow(radius,2);
		return result;
		}
	@Override
		public double area(double length, double breadth) {
		// TODO Auto-generated method stub
		return 0;
		}
	@Override
	public double area(double length, double breadth, double height) {
		// TODO Auto-generated method stub
		return 0;
	}
}

class Square implements CalcArea{
	
	@Override
	public double area(double radius) {
		// TODO Auto-generated method stub
		double result=radius*radius;
		return result;
	}

	@Override
	public double area(double length, double breadth) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double area(double length, double breadth, double height) {
		// TODO Auto-generated method stub
		return 0;
	}

}

class Triangle implements CalcArea{


	@Override
	public double area(double radius) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double area(double length, double breadth) {
		// TODO Auto-generated method stub
		double result=0.5*(breadth*length);
		return result;
	}

	@Override
	public double area(double length, double breadth, double height) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

class Sphere implements CalcVolume,CalcArea{

	@Override
	public double area(double radius) {
		// TODO Auto-generated method stub
		double result=6*Math.pow(radius, 2);
		return result;
	}

	@Override
	public double area(double length, double breadth) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double volume(double radius) {
		// TODO Auto-generated method stub
		double result=Math.pow(radius, 3);
		return result;
	}

	@Override
	public double volume(double length, double breadth, double height) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double area(double length, double breadth, double height) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

class Cuboid implements CalcVolume, CalcArea{

	@Override
	public double area(double radius) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double area(double length, double breadth) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public double area(double length, double breadth, double height) {
		// TODO Auto-generated method stub
		double result=2*((length*breadth) + (breadth*height) + (length*height));
		return result;
	}
	
	@Override
	public double volume(double radius) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double volume(double length, double breadth, double height) {
		// TODO Auto-generated method stub
		double result=length*breadth*height;
		return result;
	}


	
}