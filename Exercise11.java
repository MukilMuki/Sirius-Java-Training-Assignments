package day_7;

import java.io.File;
import java.io.IOException;

public class Exercise11 {
	public static void main(String args[]) throws IOException {
		File file = new File(args[0]);
		String[] dir = file.list();
		for (int i = 0; i < dir.length; i++)
			System.out.println(dir[i]);
	}
}
