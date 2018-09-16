package COM187.Assignment2;

public class TestHouse {

    /*****************************************************

     Filename: 		    TestHouse
     Created by: 		Melissa Brennan
     Student No:        B00714027
     Created on: 		01/11/2017
     Comment: 		    Assignment 2 - Class Test

     ******************************************************/

    public static void main(String[] args) {
        House h1 = new House();
        House h2 = new House("Melissa",2);

        h1.setOwnerName("Glenn");
        h1.setAgeInYears(3);

        h1.printHouseInfo();
        h2.printHouseInfo();

        System.out.println(h1.getHouseOwner());
        System.out.println(h2.getHouseOwner());
        System.out.println(h1.getAgeInYears());
        System.out.println(h2.getAgeInYears());

        System.out.println(House.getHouseCount());
    }
}

