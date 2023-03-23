package day_7;

import java.io.File;
import java.io.IOException;

public class Exercise_10 {
	public static void main(String args[]) throws IOException {
		File newFile = new File("/Users/mukilan/git/Sirius-Java-Training-Assignments/Java_Training_Assignments/src/day_7/delete_test.txt");
		File createFile = new File("/Users/mukilan/git/Sirius-Java-Training-Assignments/Java_Training_Assignments/src/day_7/newTest.txt");
		File renameFile= new File("/Users/mukilan/git/Sirius-Java-Training-Assignments/Java_Training_Assignments/src/day_7/Renamed.txt");
		try {
			boolean create=createFile.createNewFile();
			boolean delete =newFile.delete();
			boolean rename=createFile.renameTo(renameFile);
			
			if(!create)
				throw new IOException("Unable to create file: " + newFile.getAbsolutePath());
			else
				System.out.println("Successfully created!");
			if (!delete) 
				throw new IOException("Unable to delete file: " + newFile.getAbsolutePath());
			else 
				System.out.println("Successfully Deleted!");
			if(!rename)
				throw new IOException("Unable to rename file:" +createFile.getAbsolutePath());
			else 
				System.out.println("Successfully Renamed!");
		} 
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
