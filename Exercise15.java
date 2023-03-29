package day_7;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;

public class Exercise15 {
	public static void main(String[] args) throws IOException {
		try (BufferedReader inputStream = new BufferedReader(new FileReader("src/day_7/iotestfile.txt"));
				PrintWriter outputStream = new PrintWriter(new FileWriter("src/day_7/outputtestfile.txt"));) {
			String l;
			while ((l = inputStream.readLine()) != null) {
				outputStream.println(l);
				System.out.println(l);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}