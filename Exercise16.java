package day_7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class Exercise16 {
	public static void main(String[] args) throws Exception {

		Date date = new Date();
		try {
			FileInputStream fileInput = new FileInputStream("src/day_7/iotestfile.txt");

			FileOutputStream fileOut = new FileOutputStream("src/day_7/iotestfile.txt");
			ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
			ObjectInputStream objectIn = new ObjectInputStream(fileInput);
			objectOut.writeObject(date);
			System.out.println("The Date Object  was succesfully written to a file");
			System.out.println(objectIn.readObject());
			objectOut.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}