package day_7;

import java.util.Scanner;

public class Exercise8
{
    public static void main(String [] args){
        String word;
        String charArray[];
        int count=0;
        Scanner scan=new Scanner(System.in);
        while(scan.hasNextLine()) {
        	word=scan.nextLine();
        	charArray=word.split(" ");
        	for(int i=0;i<charArray.length;i++) {
        		count+=charArray[i].length();
        	}
        }
        System.out.println("Count of the characters is:"+count);
    }
}