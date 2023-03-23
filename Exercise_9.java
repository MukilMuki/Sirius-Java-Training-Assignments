package day_7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exercise_9 {
	static int wordcount(String st) {
		int count = 0;

		char ch[] = new char[(st).length()];
		for (int i = 0; i < (st).length(); i++) {
			ch[i] = (st).charAt(i);
			if (((i > 0) && (ch[i] != ' ') && (ch[i - 1] == ' ')) || ((ch[0] != ' ') && (i == 0)))
				count++;
		}
		return count;
	}

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		File file = new File(
				"/Users/mukilan/git/Sirius-Java-Training-Assignments/Java_Training_Assignments/src/day_7/iotestfile.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String st;
		while ((st = br.readLine()) != null)
			System.out.println(wordcount(st));
	}
}