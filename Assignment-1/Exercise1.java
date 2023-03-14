package day_1_modified;

public class Exercise1 {
	public static void main(String args[]) {
		Result mani= new Result(21,"Mani",150,120,100);
		System.out.println(mani.calculation());
	}
}

class Student{
	int rollno;
	String name;
	Student(int rollno, String name) {
		this.rollno=rollno;
		this.name=name;
	}
}

class Exam extends Student{
	int maths;
	int science;
	int history;
	Exam(int rollno, String name,int maths, int science, int history) {
		super(rollno,name);
		this.maths=maths;
		this.science=science;
		this.history=history;
		// TODO Auto-generated constructor stub
	}
}

class Result extends Exam{
	int totalmark;
	Result(int rollno, String name, int maths, int science, int history) {
		super(rollno, name,maths,science,history);
		// TODO Auto-generated constructor stub
	}
	public int calculation() {
		return totalmark=this.maths+this.science+this.history;
	}
	
}