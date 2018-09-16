package COM187.Assignment1;

import java.util.ArrayList;
import java.util.Scanner;

public class NumberArraySorter {

    /*****************************************************

     Filename: 		    NumberArraySorter
     Created by: 		Melissa Brennan
     Student No:        B00714027
     Created on: 		08/10/2017
     Comment: 		    With the aid of a menu system, the program should prompt a user to enter in a
     series of real numbers into an array or an ArrayList. The user should also have the
     choice to end the program. - Assignment 1

     ******************************************************/

    static Scanner input = new Scanner(System.in); // Create scanner object to read user inputs.

    public static void main(String[] args) {
        mainMenu(); // Call main method method to display the menu items onto the console.
    }

    private static void mainMenu()
    {
        // Menu System (Could have used \n's, but println allows the formatting in the code to be nicer.)
        System.out.println("---- Menu ----");
        System.out.println("Please select an option from the list by typing the number of the item you wish to use.");
        System.out.println("1.\tArray");
        System.out.println("2.\tArrayList");
        System.out.println("3.\tExit");
        System.out.println("--------------");
        System.out.print("Option: ");

        int userMenuOption = 0; // Initialize variable to hold users input.
        try { // Error handling for invalid character input.
            userMenuOption = input.nextInt(); // TRY to assign user input to variable.
        } catch (Exception e) { // Error handling for general exception
            System.out.println("[!] Error: An invalid character has been entered. Exiting the program."); // Output to console that the user has entered an invalid character.
            System.exit(0); // Close the program.
        }

        System.out.println("--------------");

        switch(userMenuOption) // Switch case for users input.
        {
            case 1: // If user input is 1
                optionArray(); // Jump to optionArray method.
                break;
            case 2: // If user input is 2
                optionArrayList(); // Jump to optionArrayList method.
                break;
            case 3: // If user input is 3
                System.exit(0); // Exit program.
            default: // If user input does not match a case
                System.out.println("[!] Warning: That item doesn't exist on the menu."); // Print error message to console.
                mainMenu(); // Jump to start of method again.
        }
    }

    private static void optionArray() {
        System.out.println("You selected to add numbers to \"Array\""); // Output message to console.
        System.out.print("Please input the size of the array you would like to create: "); // Output message to console.

        int arraySize  = input.nextInt(); // Initialize variable and assign user input to variable.
        double[] array = new double[arraySize]; // Declare array and initialize with user inputted size.
        int total = 0; // Initialize variable to store Divide By 6 total.
        int numberOfValues = 0; // Initialize variable to store the amount of values that can be Divided By 6.

        for (int i = 0; i < array.length; i++) // Loop to ask user for input to fill array.
        {
            System.out.println("\nArray Pos: " + (i + 1) + " of " + (arraySize)); // Print info to console to show how many inputs are left.
            System.out.print("Please enter a Real Number to occupy this position: "); // Ask user to write number to position.
            array[i] = input.nextDouble(); // Put users input into the array

            if(IsNumberDivisibleBySix(array[i])) // Check if the number the user has entered is divisible by six
            {
                total += array[i]; // Add the value at position i in the array to the total variable.
                numberOfValues++; // Add 1 to numberOfValues to keep track of how many numbers are divisible by six.
            }
        }

        // Write to the console.
        System.out.println("\n--------------");
        System.out.println("Divisible By Six Values");
        System.out.println("You entered a total of " + numberOfValues + " values which were divisible by six!");
        if(numberOfValues > 0) // If the array contains some values that are divisible by six, show the following information
        {
            System.out.println("Sum: " + total); // Print total to the console
            System.out.println("Average: " + (total / numberOfValues) + " (" + total + "/" + numberOfValues + ")"); // Work out average and print to console
        }
        System.out.println("--------------\n");

        returnToMainMenu(); // Jump to returnToMainMenu method to determine if the user wants to see the main menu again.
    }

    private static void optionArrayList() {
        System.out.println("You selected to add numbers to \"ArrayList\". You can terminate this process by typing -999"); // Print info to the console.

        ArrayList<Double> arrayList = new ArrayList<Double>(); // Initialize arrayList for real numbers by user entered later.
        int total = 0, numberOfValues = 0; // Declare and Initialize variables to store divide by six values.

        System.out.print("Please enter a number to input to the ArrayList: "); // Ask user to input value to the array.
        double valueInputted = input.nextDouble(); // Store users input into variable.

        while (valueInputted != -999) { // If the user inputs anything BUT -999, continue to add and ask for values.
            if (IsNumberDivisibleBySix(valueInputted)) { // If the number is divisible by six, add values to variables.
                total += valueInputted;
                numberOfValues++;
            }

            arrayList.add(valueInputted); // Add users input to the array.
            System.out.print("\nPlease enter another number to input to the ArrayList: "); // Ask user for another input
            valueInputted = input.nextDouble(); // Store the users input into an array.
            // recheck while condition with new value.
        }

        System.out.println("\n--------------");
        System.out.println("You entered " + arrayList.size() + " values into ArrayList."); // Print the amount of values are stored in arrayList
        System.out.println("--------------");
        System.out.println("Divisible By Six Values");
        System.out.println("You entered a total of " + numberOfValues + " values which were divisible by six!");
        if(numberOfValues > 0) // If the array contains some values that are divisible by six, show the following information
        {
            System.out.println("Sum: " + total); // Print total to the console
            System.out.println("Average: " + (total / numberOfValues) + " (" + total + "/" + numberOfValues + ")"); // Work out average and print to console
        }
        System.out.println("--------------\n");

        returnToMainMenu(); // Jump to returnToMainMenu method to determine if the user wants to see the main menu again.
    }

    // Method to check if number can be divided by 6
    private static boolean IsNumberDivisibleBySix(double number)
    {
        // If (number / 6) gives a whole number
        if(number % 6 == 0)
            return true;

        return false;
    }

    // Method to ask user if they wish to go back to the main menu.
    private static void returnToMainMenu()
    {
        System.out.print("Would you like to return to the main menu? (Y/N): "); // Ask user if they wish to return to the main menu.

        String userInput = input.next(); // Store users input

        if(userInput.length() > 1) // If input is not single character
            System.out.println("[!] Using the first character of the input due to input being longer than expected.");

        char option = userInput.charAt(0); // Get a single character from the string input from the start of the string.

        if(option == 'Y' || option == 'y') // If the character is y (for yes)
        {
            mainMenu(); // Jump to mainMenu method.
        }
        else if(option == 'N' || option == 'n') // If the character is n (for no)
        {
            System.out.println("Exiting Program."); // Inform the use the program will exit.
            System.exit(0); // Exit the program.
        }
        else // If the character is not Y or N
        {
            System.out.println("Invalid Input. Exiting Program."); // Inform the user of invalid input
            System.exit(0); // Exit the program.
        }
    }
}

