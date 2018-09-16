package COM187.Assignment2;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraySorter {

    /*****************************************************

     Filename: 		    ArraySorter
     Created by: 		Melissa Brennan
     Student No:        B00714027
     Created on: 		01/11/2017
     Comment: 		    Assignment 2 - Class Test

     ******************************************************/

    public static void main(String[] args) {
        int[] storageComponentArray = new int[]{};
        ArrayList<Integer> storageComponentArrayList = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);

        do {
            storageComponentArrayList.add(keyboard.nextInt()); // Add user int input to arraylist.
        }
        while (storageComponentArrayList.size() < 10); // Do code above if the size of the arraylist is less than 10.


        /*
         *   ALTERNATIVELY, you can sort the array, and the first and last element would contain the smallest and largest number.
         */
        // Bubblesort
        int j, temp;
        boolean flag = true;
        while (flag)
        {
            flag = false;
            for(j = 0; j < storageComponentArrayList.size() -1; j++)
            {
                if ( storageComponentArrayList.get(j) > storageComponentArrayList.get(j+1))
                {
                    temp = storageComponentArrayList.get(j);
                    storageComponentArrayList.set(j, storageComponentArrayList.get(j+1));
                    storageComponentArrayList.set(j+1, temp);
                    flag = true;
                }
            }
        }

        System.out.println("Largest: " + storageComponentArrayList.get(storageComponentArrayList.size() - 1));
        System.out.println("Smallest: " + storageComponentArrayList.get(0));




        // Form of Linear search - It will search each element of the ArrayList and compare.
        /*
        int largest = storageComponentArrayList.get(0), smallest = storageComponentArrayList.get(0); // Initialize and Declare integers to store the largest and smallest integers/
        for(int i = 0; i < storageComponentArrayList.size(); i++) // Loop arraylist
        {
            if(storageComponentArrayList.get(i) > largest) // If the number at the position i in the arraylist is greater than largest.
            {
                largest = storageComponentArrayList.get(i); // Change largest integer to the value found at i.
            }

            if(storageComponentArrayList.get(i) < smallest) // If the number at the position i in the arraylist is smaller than smallest.
            {
                smallest = storageComponentArrayList.get(i); // Change the smallest integer to the value found at i.
            }
        }


        System.out.println("Largest : " + largest);
        System.out.println("Smallest : " + smallest);*/
    }
}
