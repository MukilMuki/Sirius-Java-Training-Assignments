package day_7;

import java.io.FileReader;
import java.io.FileWriter;

public class Exercise14 {
	public static void main(String[] args) throws Exception {

		FileReader in = new FileReader("src/day_7/iotestfile.txt");

		try (FileWriter out = new FileWriter("src/day_7/outputtestfile.txt")) {
			char c[] = new char[8];
			int i = 0;
			while ((i = in.read(c)) != -1) {
				String s = new String(c, 0, i);
				System.out.println(s);
				out.write(s);
			}
		} catch (Exception e) {

		}
	}
}