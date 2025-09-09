// RevStrWarmUp.java
// dH 9/9/25

import java.sql.SQLOutput;

public class RevStrWarmUp {
    public static void main(String[] args) {

        System.out.println("\n Welcome to my Reverse String Warm Up program!");

        // Create a program that reverses a string using a for loop
        // define this program in term of input/processing/output

        // there is no input in this program, everything is hard coded
        // processing is: Decrementing a for loop, finding the length of the string,
        // create a new string
        // with the end characters at the end of the string

        // Create a couple of string variables and initialize myStr
        String myStr = "abcdefghijk";
        String myRevStr = "";

        // Create a for loop and use it to get each char from the str and use it
        // I know how to decrement a for loop

        int strLength = myStr.length();

        System.out.println("\n strLength is " + strLength);
        System.out.println("\n char at index 11 is  " + myStr.charAt(10) );



        for (int i = (strLength-1); i >= 0; i--) {
            System.out.println("\n the char at " + i + " is " + myStr.charAt(i) );
            myRevStr  += myStr.charAt(i);
        }

        System.out.println("\n\n myRevStr is: " + myRevStr + "\n\n");

    }
}