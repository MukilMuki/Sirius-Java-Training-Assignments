package day_3;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;

public class Exercise6 {
	static Stack <Character> characterStack = new Stack <Character>();
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		int i=0;
		ExecutorService es=Executors.newFixedThreadPool(1);
			es.execute(()->{
				while(i==0) {
					try {
						Scanner input = new Scanner(System.in);
						System.out.print("Choose letter");
						char letter = input.next().charAt(0);
						if (Character.toString(letter).matches("^[a-zA-Z]*$")) {
							characterTotal(letter);
						}else{
							throw new InputMismatchException();
						}
					}
					catch(Exception e) {
						System.out.println("Use an alphabet instead of non-alphabet");
					}
				}
			});
			es.shutdown();
	}
	public static void characterTotal(char alphabet) {
		characterStack.push(alphabet);
		System.out.println("Running total of characters is:"+characterStack.size());
	}
}