package COM186.Assignment5;

public class TestVinylCollection {

    /**************************************************************

     Filename: 		    TestVinylCollection.java
     Created by: 		Melissa Brennan (B00714027)
     Created on: 		26 April 2017
     Comment: 		    Method to test the VinylCollection Class

     ***************************************************************/

    public static void main(String[] args) {
        // Declaring and Initialising Objects
        VinylCollection myFirst = new VinylCollection("Bob Smith", "Sham", 1980, true);
        VinylCollection yourFirst = new VinylCollection(1, "Bonni Raitt", "Nick of Time", 1989, false, 6.25, 11.99);

        // Prints all the information about each of the Objects using a method within the object class
        System.out.println("myFirst:");
        myFirst.printAllInfo();

        System.out.println("\nyourFirst:");
        yourFirst.printAllInfo();

        // Prints out the returned int value from the getYearOfIssue method within the object
        System.out.println("\nmyFirst Year of Issue: " + myFirst.getYearOfIssue());

        // Calling a method within the object to update the price of yourFirst
        System.out.println("\nyourFirst Updating Prices.");
        System.out.println("Updating price by £2.50");
        yourFirst.updatePrices(2.50);
        yourFirst.printAllInfo(); // Prints all the information about yourFirst to see if changes were made.

        // Calling a method within the object to update the price of yourFirst
        System.out.println("\nUpdating price by £5 from the last updatePrice");
        yourFirst.updatePrices(5);
        yourFirst.printAllInfo(); // Prints all the information about yourFirst to see if changes were made.

    }
}
