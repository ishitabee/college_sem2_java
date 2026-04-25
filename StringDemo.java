//Java program to demonstrate String and String functions

public class StringDemo {
    public static void main(String[] args) {
        String str= "Hello Ishita!";

        //String length
        System.out.println("Length: "+ str.length());

        //Converting to uppercase
        System.out.println("Uppercase: "+ str.toUpperCase());
        
        //Converting to lowercase
        System.out.println("Lowercase: "+ str.toLowerCase());

        //Substring
        System.out.println("Substring : "+ str.substring(7,11));

        //String concatenation
        System.out.println("Concatenation: "+ str.concat(" Welcome!"));
    }
}