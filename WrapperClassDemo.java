//7.Java Program to implement Wrapper classes and their methods

public class WrapperClassDemo {
	public static void main(String [] args) {
		Integer num= Integer.valueOf(100);
		System.out.println("Integer value: " + num);
		System.out.println("Binary representation: " + Integer.toBinaryString(num));
		System.out.println("Double value: " + num.doubleValue());
	}
}