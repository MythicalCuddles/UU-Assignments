package COM186.Assignment6;

import sun.util.BuddhistCalendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestPet {

    /**************************************************************

     Filename: 		    TestPet.java
     Created by: 		Melissa Brennan (B00714027)
     Created on: 		03 May 2017
     Comment:           Assignment 6

     ***************************************************************/

    public static void main(String[] args) {
        Calendar c = new GregorianCalendar(); // Create a Calendar Object
        int currentYear = c.getWeekYear(); // Gets the current year from the Calendar Object

        // Declaring and Initialising Pet Objects
        Pet myPet = new Pet("Guinea Pig", "Female", false, 2010, 5);
        Pet exoticPet = new Pet("Norm", "Tortoise", "Male", true, 1990, 40, 75.0);

        // Changing values within myPet object
        myPet.setName("Wendy");
        myPet.setPrice(20.0);

        // Printing each of the Objects out to the screen (PART B3)
        System.out.println("-> Printing out information about myPet using the showPet method");
        myPet.showPet();
        System.out.println("\n-> Printing out information about exoticPet using the showPet method");
        exoticPet.showPet();

        // Prints the Life Expectancy by calling the printLifeExpectancy within the Pet object
        System.out.println("\n-> Life Expectancy of myPet using the printLifeExpectancy() method");
        myPet.printLifeExpectancy();

        // Prints the int value returned from calling the method leftToLive in the Pet object
        System.out.println("\n-> Left to Live value of exoticPet using the leftToLive() method");
        System.out.println("exoticPet is likely to live " + exoticPet.leftToLive(currentYear) + " more years.");
    }
}

