package day_7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exercise12 {
	public static void main(String args[]) throws IOException {
		try (FileInputStream fileIn = new FileInputStream("src/day_7/Dragon.png");
				FileOutputStream fileOut = new FileOutputStream("src/day_7/Destination.png")) {
			byte[] byteArray = new byte[4096];
			int byteTraverse;
			while ((byteTraverse = fileIn.read(byteArray)) != -1) {
				fileOut.write(byteArray, 0, byteTraverse);
			}
			System.out.println("Image has been copied to the destination");
		} catch (Exception e) {
			System.out.println("Error while copying image");
		}
	}
}
