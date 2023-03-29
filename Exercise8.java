package day_7;

import java.util.Scanner;

public class Exercise8 {
	public static void main(String[] args) {
		String word;
		String charArray[];
		int count = 0;
		try (Scanner scan = new Scanner(System.in)) {
			while (scan.hasNextLine()) {
				if (scan.hasNextLine() != false) {
					word = scan.nextLine();
					if (word.matches("^[a-zA-Z]*$")) {
						charArray = word.split(" ");
						for (int i = 0; i < charArray.length; i++) {
							count += charArray[i].length();
						}
					}
					else {
						System.out.println("Please enter only alphabets!");
					}
				}
			}
			System.out.println("Count of the characters is:" + count);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}