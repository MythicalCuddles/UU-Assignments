package COM186.Assignment5;

import java.text.DecimalFormat;

public class VinylCollection {

    /**************************************************************

     Filename: 		    VinylCollection.java
     Created by: 		Melissa Brennan (B00714027)
     Created on: 		26 April 2017
     Comment:           Assignment 5

     ***************************************************************/

    // Declaring Variables
    private int uniqueNumber, yearOfIssue;
    private String artistName, recordName;
    private double costPrice, salesPrice;
    private boolean single;

    // Default Constructor for Object with no parameters passed.
    public VinylCollection() {
        artistName = "";
        recordName = "";

        single = false;

        yearOfIssue = 2000;
        uniqueNumber = 0;
        costPrice = 0.0;
        salesPrice = 0.0;
    }

    // Parametrized Constructor for Object with 4 different parameters being passed.
    public VinylCollection(String ArtistName, String RecordName, int Year, boolean isSingle) {
        artistName = ArtistName;
        recordName = RecordName;
        yearOfIssue = Year;
        single = isSingle;

        uniqueNumber = 0;
        costPrice = 0.0;
        salesPrice = 0.0;
    }

    // Parametrized Constructor for Object with all the variables declared above being assigned a passed value.
    public VinylCollection(int UniqueNumber, String ArtistName, String RecordName, int Year, boolean Single, double Price, double SalePrice) {
        uniqueNumber = UniqueNumber;
        artistName = ArtistName;
        recordName = RecordName;
        costPrice = Price;
        salesPrice = SalePrice;
        yearOfIssue = Year;
        single = Single;
    }

    // Prints all the variables for an object
    public void printAllInfo()
    {
        System.out.println("ID: " + uniqueNumber);
        System.out.println("Artist Name: " + artistName);
        System.out.println("Record Name: " + recordName);

        DecimalFormat df = new DecimalFormat("0.00"); // DecimalFormat to print costs with 2 decimal places
        System.out.println("Cost: £" + df.format(costPrice));
        System.out.println("Sales Price: £" + df.format(salesPrice));

        System.out.println("Year of Issue: " + yearOfIssue);
        System.out.println("Single? " + single);
    }

    // This method updates the costPrice and salesPrice using the double value passed to the method
    public void updatePrices(double amount)
    {
        costPrice += amount;
        salesPrice += (amount * 2);
    }

    // This method gets and returns the yearOfIssue int value
    public int getYearOfIssue()
    {
        return yearOfIssue;
    }
}
