package day_3;

public class Exercise8 extends Thread {
	StringBuffer stringBuffer;

	Exercise8(StringBuffer stringBuffer) {
		this.stringBuffer = stringBuffer;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		synchronized (stringBuffer) {
			for (int i = 1; i <= 100; i++)
				System.out.println(stringBuffer);
			System.out.println();
			stringBuffer.setCharAt(0, (char) (stringBuffer.charAt(0) + 1));
		}
	}

	public static void main(String args[]) {
		StringBuffer A = new StringBuffer("A");
		Exercise8 Thread1 = new Exercise8(A);
		Exercise8 Thread2 = new Exercise8(A);
		Exercise8 Thread3 = new Exercise8(A);

		Thread1.start();
		Thread2.start();
		Thread3.start();
	}
}
