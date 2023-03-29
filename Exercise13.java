package day_7;

import java.io.FileReader;
import java.io.FileWriter;

public class Exercise13 {
	public static void main(String[] args) throws Exception {
		try (FileReader in = new FileReader("src/day_7/iotestfile.txt")) {
			char c[] = new char[4096];
			int i = 0;
			while ((i = in.read(c)) != -1) {
				String s = new String(c, 0, i);
				System.out.println(s);
			}
		}
	}
}