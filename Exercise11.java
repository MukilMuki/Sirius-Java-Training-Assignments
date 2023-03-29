package day_7;

import java.io.File;
import java.io.IOException;
public class Exercise11 {
   public static void main(String args[]) throws IOException {
      File directoryPath = new File("/Users/mukilan");
      File filesList[] = directoryPath.listFiles();
      System.out.println("List of files and directories in the specified directory:");
      for(File file : filesList) {
         System.out.println("File name: "+file.getName());
         System.out.println("File path: "+file.getAbsolutePath());
         System.out.println(" ");
      }
   }
}