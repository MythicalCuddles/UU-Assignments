package COM186.Assignment3;

import java.util.Scanner;

public class Accommodation {

    /**************************************************************

     Filename: 		    Accommodation
     Created by: 		Melissa Brennan (B00714027)
     Created on: 		08 March 2017
     Comment: 		    Class Test - Task B

     ***************************************************************/

    public static void main(String[] args) {
        // Declaring and Initialising Variables needed
        int _houseNumber = 0, _receptionNumber = 0, _bedroomCount = 0;
        String _address1 = "", _address2 = "", _hasDetachedGarage = "";
        double _marketValue = 0.0;

        // Creating an instance of the scanner class
        Scanner keyboardInput = new Scanner(System.in);

        System.out.println("Information about the Accommodation");
        System.out.println("-----------------------------------");
        // Inputs from keyboard
        System.out.println("Please enter the House Number: "); // Output to console
        _houseNumber = keyboardInput.nextInt(); // Keyboard Input for House Number

        System.out.print("Please enter Line 1 of the Address: \n");
        _address1 = keyboardInput.next(); // Keyboard Input for Address

        System.out.print("Please enter Line 2 of the Address: \n");
        _address2 = keyboardInput.next(); // Keyboard Input for Address

        System.out.println("Please enter the amount of Bedrooms: ");
        _bedroomCount = keyboardInput.nextInt(); // Keyboard Input for Bedroom Count

        System.out.println("Please enter Reception Number: ");
        _receptionNumber = keyboardInput.nextInt(); // Keyboard Input for Reception Number

        System.out.print("Please enter Estimate Market Value: \n£");
        _marketValue = keyboardInput.nextDouble(); // Keyboard Input for Market Value

        System.out.println("Does the house have a detached garage? (Y/N) ");
        _hasDetachedGarage = keyboardInput.next(); // Keyboard Input for Comment

        System.out.println("-----------------------------------");

        System.out.println("\n\n"); // Put some space between input section and output section

        //Output accommodation information to console
        System.out.println("-------------------------");
        System.out.println("Accommodation Information");
        System.out.println("-------------------------");
        // Output house number and address on one line, and the second address line on the next
        System.out.println("Address: \n\t" + _houseNumber + " " + _address1 + "\n\t" + _address2);
        // Output bedroom count
        System.out.print("Bedroom Count: \n\t" + _bedroomCount + "\n");
        // Output reception number
        System.out.print("Reception Number: \n\t" + _receptionNumber + "\n");
        // Output Estimate Market Value
        System.out.print("Est. Market Value: \n\t£" + _marketValue + "\n");
        // Output if the house has a detached garage
        System.out.println("Does the house have a detached garage? \n\t" + _hasDetachedGarage);
    }
}

