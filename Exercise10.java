package day_7;

import java.io.File;
import java.io.IOException;

public class Exercise10 {
	public static void main(String args[]) throws IOException {
		File newFile = new File("src/day_7/BeforeRename_test.txt");
		File deleteFile = new File("src/day_7/Delete_test.txt");
		File createFile = new File("src/day_7/newTest.txt");
		File renameFile = new File("src/day_7/Renamed.txt");
		try {
			boolean create = createFile.createNewFile();
			boolean deleteNew = deleteFile.createNewFile();
			boolean delete = deleteFile.delete();
			boolean rename = createFile.renameTo(renameFile);
			System.out.println("The Size of the renamed file is "+renameFile.getTotalSpace()+" bytes.");
			if (!create)
				throw new IOException("Unable to create file: " + newFile.getAbsolutePath());
			else
				System.out.println("Successfully created!");
			if (!deleteNew)
				throw new IOException("Unable to create file: " + deleteFile.getAbsolutePath());
			if (!delete)
				throw new IOException("Unable to delete file: " + deleteFile.getAbsolutePath());
			else
				System.out.println("Successfully Deleted!");
			if (!rename)
				throw new IOException("Unable to rename file:" + createFile.getAbsolutePath());
			else
				System.out.println("Successfully Renamed!");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
