package day_3;

public class Exercise8 extends Thread{
	StringBuffer sb;
	Exercise8(StringBuffer sa){
		this.sb=sa;
	}
	@Override
	synchronized public void run() {
		int i=0;
		while(i<100) {
			System.out.println(sb);
			i++;
		}
		char ssb=sb.charAt(0);
		sb.setCharAt(0,ssb++);
	}
	
	public static void main(String args[]) {
		StringBuffer A=new StringBuffer("A");
		Exercise8 Thread1=new Exercise8(A);
		Exercise8 Thread2=new Exercise8(A);
		Exercise8 Thread3=new Exercise8(A);
		
		Thread1.start();
		Thread2.start();
		Thread3.start();
	}
}
