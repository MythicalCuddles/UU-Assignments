package COM187.Assignment2;

public class House {

    /*****************************************************

     Filename: 		    House
     Created by: 		Melissa Brennan
     Student No:        B00714027
     Created on: 		01/11/2017
     Comment: 		    Assignment 2 - Class Test

     ******************************************************/

    private String ownerName;
    private int ageInYears;

    private static int houseCount;

    public House() // Constructor with no parameters.
    {
        this.ownerName = null; // Initialises ownerName variable with null.
        this.ageInYears = 0; // Initialises ageInYears variable with the value 0.

        houseCount++; // Adds 1 to houseCount.
    }

    public House(String ownerName, int ageInYears) // Constructor with parameters.
    {
        this.ownerName = ownerName; // Initialises ownerName with passed parameter.
        this.ageInYears = ageInYears; // Initialises ageInYears with passed parameter.

        houseCount++; // Adds 1 to houseCount.
    }

    public void setOwnerName(String ownerName) // Set Method to set ownerName of a House Object.
    {
        this.ownerName = ownerName; // Sets the ownerName variable with the parameter value passed.
    }

    public void setAgeInYears(int ageInYears) // Set Method to set ageInYears of a House Object.
    {
        this.ageInYears = ageInYears; // Sets the ageInYears variable with the parameter value passed.
    }

    public String getHouseOwner() // Get Method to return the ownerName of a House Object.
    {
        return this.ownerName; // Returns the value stored in ownerName.
    }

    public int getAgeInYears() // Get Method to return the ageInYears of a House Object.
    {
        return this.ageInYears; // Returns the value stored in ageInYears.
    }

    public void printHouseInfo() // Prints the House information to the console.
    {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Age of House (in years): " + ageInYears);
    }

    public static int getHouseCount() // Get Method to return the houseCount class property.
    {
        return houseCount; // Returns the value stored in houseCount.
    }
}
