//13.Java program to implement the concept of Exception Handling using predefined exception

public class ExceptionHandlingDemo {
	public static void main(String[] args){
		try{
		    int result=10/0; //this will cause ArithmeticException
		} catch (ArithmeticException e) {
			System.out.println("Exception caught: " + e.getMessage());
		}
	}
}
