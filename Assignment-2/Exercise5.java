package day_2;

 
public class Exercise5 {

    public static void main(String args[]) throws MyException
    {
    	exceptionCatch();
    }
    
	public static void exceptionCatch() throws MyException{
            throw new MyException("Custom Exception");
	}
}