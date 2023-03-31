package day_7;

import java.util.Scanner;

public class Exercise9 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in);) {
			String sentence = scan.nextLine();
			if(sentence!=null || !sentence.isEmpty()){
				String[] words = sentence.split("\\s+");
				System.out.println("Number of words given in the string: "+words.length);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}