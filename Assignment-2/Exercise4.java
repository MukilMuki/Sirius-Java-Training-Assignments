package day_2;


class MyException extends Exception {
    public MyException(String message)
    {
        super(message);
    }
}

public class Exercise4 {
    public static void main(String args[])
    {
        try {
            throw new MyException("Custom Exception");
        }
        catch (MyException e) {
            System.out.println("The Custom Exception has been caught");
            System.out.println(e.getMessage());
        }
    }
}