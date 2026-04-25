//Java program to demonstrate control statements

public class ControlStatementsDemo {
    public static void main(String[] args) {
        int num = 10;

        // If-else statement
        if (num > 0) {
            System.out.println("The number is positive.");
        } else if (num < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        //For loop
        System.out.println("For loop from 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        //While loop
        System.out.println("While loop from 1 to 5:");
        int count = 1;
        while (count <= 5) {
            System.out.println(count);
            count++;
        }
    }
}    