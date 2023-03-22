package day_1;

import java.util.Scanner;

public class Exercise8{
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		Circle shapeCircle=new Circle();
		Square shapeSquare=new Square();
		Triangle shapeTriangle=new Triangle();
		Sphere shapeSphere=new Sphere();
		Cuboid shapeCuboid=new Cuboid();
		System.out.println("Enter the radius of the circle");
		int circleRadius=scan.nextInt();
		System.out.println("Enter the side of the square");
		int squareSide=scan.nextInt();
		System.out.println("Enter the height and breadth of the triangle");
		int triangleHeight=scan.nextInt();
		int triangleBreadth=scan.nextInt();
		System.out.println("Enter the radius of the sphere");
		int sphereRadius=scan.nextInt();
		System.out.println("Enter the length, breadth, height");
		int cuboidLength=scan.nextInt();
		int cuboidBreadth=scan.nextInt();
		int cuboidHeight=scan.nextInt();
		System.out.println("Area of Circle:"+shapeCircle.area(circleRadius));
		System.out.println("Area of Square:"+shapeSquare.area(squareSide));
		System.out.println("Area of Triangle:"+shapeTriangle.area(triangleHeight,triangleBreadth));
		System.out.println("Area of Sphere:"+shapeSphere.area(sphereRadius)+"Volume of Sphere:"+shapeSphere.volume(sphereRadius));
		System.out.println("Area of Cuboid:"+shapeCuboid.area(cuboidLength,cuboidBreadth,cuboidHeight)+"Volume of Cuboid:"+shapeCuboid.volume(cuboidLength,cuboidBreadth,cuboidHeight));
	}
}

interface ShapeArea{
	double area(double radius);
	double area(double length,double breadth);
	double area(double length, double breadth, double height);
	final static double pi=3.14;
}

interface ShapeVolume{
	double volume(double radius);
	double volume(double length,double breadth, double height);
}


class Circle implements ShapeArea{
	
	@Override
		public double area(double radius) {
			double result = 3.14*Math.pow(radius,2);
		return result;
		}
	@Override
		public double area(double length, double breadth) {
		return 0;
		}
	@Override
	public double area(double length, double breadth, double height) {
		return 0;
	}
}

class Square implements ShapeArea{
	
	@Override
	public double area(double radius) {
		double result=radius*radius;
		return result;
	}

	@Override
	public double area(double length, double breadth) {
		return 0;
	}

	@Override
	public double area(double length, double breadth, double height) {
		return 0;
	}

}

class Triangle implements ShapeArea{


	@Override
	public double area(double radius) {
		return 0;
	}

	@Override
	public double area(double length, double breadth) {
		double result=0.5*(breadth*length);
		return result;
	}

	@Override
	public double area(double length, double breadth, double height) {
		return 0;
	}
	
}

class Sphere implements ShapeVolume,ShapeArea{

	@Override
	public double area(double radius) {
		double result=6*Math.pow(radius, 2);
		return result;
	}

	@Override
	public double area(double length, double breadth) {
		return 0;
	}

	@Override
	public double volume(double radius) {
		double result=Math.pow(radius, 3);
		return result;
	}

	@Override
	public double volume(double length, double breadth, double height) {
		return 0;
	}

	@Override
	public double area(double length, double breadth, double height) {
		return 0;
	}
	
}

class Cuboid implements ShapeVolume, ShapeArea{

	@Override
	public double area(double radius) {
		return 0;
	}

	@Override
	public double area(double length, double breadth) {
		return 0;
	}
	
	@Override
	public double area(double length, double breadth, double height) {
		double result=2*((length*breadth) + (breadth*height) + (length*height));
		return result;
	}
	
	@Override
	public double volume(double radius) {
		return 0;
	}

	@Override
	public double volume(double length, double breadth, double height) {
		double result=length*breadth*height;
		return result;
	}


	
}