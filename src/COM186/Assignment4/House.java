package COM186.Assignment4;

import java.util.Scanner;

public class House {

    /**************************************************************

     Filename: 		    House
     Created by: 		Melissa Brennan (B00714027)
     Created on: 		22 March 2017
     Comment: 		    Assignment 4

     ***************************************************************/

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        // Variable to store first name of user
        String firstName = "";

        // Prompts the user to enter their first name
        System.out.print("Please enter your first name: ");
        firstName = keyboard.next();

        // Prints information about the different systems to the user
        System.out.println("1.\tEnter your hometown\n2.\tEnter your street\n3.\tEnter your house number\n4.\tExit the system");
        System.out.println("Please enter the number of the system you wish to access:");

        // Reads user input and determines which system they wish to use.
        switch(keyboard.nextInt())
        {
            case 1: // Enter the hometown information
                System.out.println("Thanks " + firstName + ", you live in " + enterHometown()); // Call method to prompt for user input
                break;
            case 2: // Enter the street information
                System.out.println("Thanks " + firstName + " you live in " + enterStreet()); // Call method to prompt for user input
                break;
            case 3: // Enter house number information
                System.out.println("Thanks " + firstName + " you live in house number " + enterHouseNumber()); // Call method to prompt for user input
                break;
            case 4: // Exit the system
                System.out.println("Thanks " + firstName + ". Goodbye.");
                break;
            default: // Invalid choice
                System.out.println("Invalid Option " + firstName + ". Goodbye");
                break;
        }
    }

    // Method to read user input and return it to the main method
    public static String enterHometown() {
        System.out.println("Please enter your Hometown:");
        return keyboard.next(); // Returns user input
    }

    // Method to read user input and return it to the main method
    public static String enterStreet() {
        System.out.println("Please enter your Street Name:");
        return keyboard.next() + keyboard.nextLine(); // Reads user input -
    }

    // Method to read user input and return it to the main method
    public static int enterHouseNumber() {
        System.out.println("Please enter your House Number:");
        return keyboard.nextInt(); // Returns user input
    }
}
