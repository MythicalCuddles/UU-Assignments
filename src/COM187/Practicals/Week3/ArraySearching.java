package COM187.Practicals.Week3;

import java.util.Random;
import java.util.Scanner;

public class ArraySearching {
    static Scanner input = new Scanner(System.in);
    static Random random = new Random();
    static int[] numberArray;

    public static void main(String[] args) {
        startingMethod();
    }

    private static void startingMethod()
    {
        System.out.print("What size should the array be?: ");
        int sizeOfArray = input.nextInt();

        numberArray = new int[sizeOfArray];

        // Generate numbers for array
        for(int i = 0; i < sizeOfArray; i++)
        {
            numberArray[i] = random.nextInt(10000);
        }

        System.out.println("Here are the random numbers that are in your unsorted array\n");
        //Print array
        for(int i : numberArray)
        {
            System.out.print(i + " ");
        }

        System.out.println("\nPlease wait 1 second.");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.print("\nWhich integer do you want to search for: ");
        int searchFor = input.nextInt();

        promptUserForSearch(searchFor);
    }

    private static void promptUserForSearch(int searchFor)
    {
        System.out.println("Would you like to:\n1.\tSearch Unsorted Array\n2.\tSearch Sorted Array");
        System.out.print("Please enter the menu number you would like to perform: ");
        int optionSelected = input.nextInt();

        switch(optionSelected)
        {
            case 1:
                System.out.println("\nSearching the array for " + searchFor + " using the linear method.");
                SearchingMethods.linearSearch(numberArray, searchFor);
                System.out.print("\nEnter 1 to go again, enter any other number to quit: ");
                if(input.nextInt() == 1) { startingMethod(); } else { System.exit(0); }
                break;
            case 2:
                optionSortedArray(searchFor);
                break;
            default:
                System.out.println("Invalid Option.");
                promptUserForSearch(searchFor);
        }
    }

    private static void optionSortedArray(int searchFor) {
        System.out.println("Would you like to:\n1.\tUse Binary Search\n2.\tUse Bubble Sort\n3.\tUse Selection Sort\n4.\tUse Array.Sort");
        System.out.print("Please enter the menu number you would like to perform: ");
        int option = input.nextInt();

        switch(option)
        {
            case 1:
                SearchingMethods.binarySearch(numberArray, searchFor);
                //java.util.Arrays.binarySearch(numberArray, searchFor);
                break;
            case 2:
                SearchingMethods.bubbleSort(numberArray);
                break;
            case 3:
                SearchingMethods.selectionSort(numberArray);
                break;
            case 4:
                java.util.Arrays.sort(numberArray);
                break;
            default:
                System.out.println("Invalid Option.");
                optionSortedArray(searchFor);
        }
    }
}