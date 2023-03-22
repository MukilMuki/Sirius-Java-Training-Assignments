package day_1;

import java.util.Scanner;

public class Exercise1 {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		String studentName= scan.nextLine();
		int studentRollNumber=scan.nextInt();
		int mathMark=scan.nextInt();
		int scienceMark=scan.nextInt();
		int historyMark=scan.nextInt();
		Result studentResult= new Result(studentRollNumber, studentName, mathMark, scienceMark, historyMark);
		System.out.println("Hi "+studentName+" Your total mark is:"+studentResult.resultCalculation());
	}
}

class Student{
	int rollNumber;
	String studentName;
}

class Exam extends Student{
	int maths;
	int science;
	int history;
	Exam(int rollno, String name,int maths, int science, int history) {
		super.rollNumber=rollno;
		super.studentName=name;
		this.maths=maths;
		this.science=science;
		this.history=history;
	}
}

class Result extends Exam{
	int totalmark;
	Result(int rollno, String name, int maths, int science, int history) {
		super(rollno, name,maths,science,history);
	}
	
	public int resultCalculation() {
		return totalmark=this.maths+this.science+this.history;
	}
	
}