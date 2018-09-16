package COM186.Assignment6;

public class Pet {

    /**************************************************************

     Filename: 		    Pet.java
     Created by: 		Melissa Brennan (B00714027)
     Created on: 		03 May 2017
     Comment:           Assignment 6

     ***************************************************************/

    private String kindOfPet, petName, gender;
    private boolean needsALicense;
    private double pricePaid;
    private int yearBorn, lifeExpectancyInYears;

    // Default Constructor for Pet
    public Pet()
    {
        // Assigning values to the variables
        petName = "";
        kindOfPet = "";
        gender = "";
        needsALicense = false;
        yearBorn = 0;
        lifeExpectancyInYears = 0;
        pricePaid = 0.0;
    }

    // Parametrized Constructor for Pet, assigning the known values to their variables
    public Pet(String kindOfPet, String gender, boolean needsALicense, int yearBorn, int lifeExpectancyInYears)
    {
        this.kindOfPet = kindOfPet;
        this.gender = gender;
        this.needsALicense = needsALicense;
        this.yearBorn = yearBorn;
        this.lifeExpectancyInYears = lifeExpectancyInYears;

        // Initialising the variables that the values are not known for
        this.petName = "";
        this.pricePaid = 0.0;
    }

    // Parametrized Constructor for Pet, assigning all the values to variables
    public Pet(String petName, String kindOfPet, String gender, boolean needsALicense, int yearBorn, int lifeExpectancyInYears, double pricePaid)
    {
        this.petName = petName;
        this.kindOfPet = kindOfPet;
        this.gender = gender;
        this.needsALicense = needsALicense;
        this.yearBorn = yearBorn;
        this.lifeExpectancyInYears = lifeExpectancyInYears;
        this.pricePaid = pricePaid;
    }

    // Method to print out all the information about the Pet
    public void showPet()
    {
        System.out.println("----- Pet Information -----");
        System.out.println("Pet Name: " + petName);
        System.out.println("Type of Pet: " + kindOfPet);
        System.out.println("Gender: " + gender);
        System.out.println("Is a License Needed?: " + needsALicense);
        System.out.println("Year Born: " + yearBorn);
        System.out.println("Life Expectancy: " + lifeExpectancyInYears);
        System.out.println("Price Paid: £" + pricePaid);
        System.out.println("---------------------------");
    }

    // Set Method to change the petName variable for the Pet Object
    public void setName(String petName)
    {
        this.petName = petName;
    }

    // Set Method to change the pricePaid variable for the Pet Object
    public void setPrice(double pricePaid)
    {
        this.pricePaid = pricePaid;
    }

    // Get Method to return the int variable lifeExpectancyInYears
    public int getLifeExpectancy()
    {
        return lifeExpectancyInYears;
    }

    // Method to print the lifeExpectancyInYears which is returned in the getLifeExpectancy() method
    public void printLifeExpectancy()
    {
        System.out.println("Life Expectancy: " + getLifeExpectancy());
    }

    // Get Method to return the age of the Pet which is worked out with values given
    public int getAge(int currentYear)
    {
        int age = currentYear - yearBorn;
        return age;
    }

    // Get Method to return the amount of years the Pet has left to live
    public int leftToLive(int currentYear)
    {
        int yearsLeft = getLifeExpectancy() - getAge(currentYear);
        return yearsLeft;
    }

}

