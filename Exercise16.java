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
			FileInputStream fileInput = new FileInputStream(
					"/Users/mukilan/git/Sirius-Java-Training-Assignments/Java_Training_Assignments/src/day_7/iotestfile.txt");

			FileOutputStream fileOut = new FileOutputStream(
					"/Users/mukilan/git/Sirius-Java-Training-Assignments/Java_Training_Assignments/src/day_7/iotestfile.txt");
			ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
			ObjectInputStream objectIn = new ObjectInputStream(fileInput);
			objectOut.writeObject(date);
			System.out.println(objectIn.readObject());
			objectOut.close();
			System.out.println("The Object  was succesfully written to a file");

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}