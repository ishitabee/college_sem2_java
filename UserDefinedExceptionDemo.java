//14. Java program to implement Exception Handling by creating user-defined exceptions

class MyException extends Exception {
	public MyException(String message) {
		super(message);
	}
}

public class UserDefinedExceptionDemo {	
	public static void main(String[] args) {	
		try{
		    throw new MyException("This is a user-defined exception.");
		}catch (MyException e) {
		    System.out.println("Exception caught: " + e.getMessage());
		}
	}
}