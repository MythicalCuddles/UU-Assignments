package COM187.Practicals.Week2;

import java.util.Scanner;

public class BookArrayMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String bookTitles[];

        bookTitles = enterBooks(input);

        printBooks(bookTitles);

        System.out.println("Which book would you like to remove?: ");
        String removeBookTitle = input.nextLine();

        removeBook(bookTitles, removeBookTitle);
    }

    public static String[] enterBooks(Scanner input)
    {
        String books[] = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Please enter a title for Book id " + i + ": ");
            books[i] = input.nextLine();
        }
        return books;
    }

    public static void printBooks(String[] bookTitles)
    {
        for (int i = 0; i < bookTitles.length; i++) {
            System.out.println("Book Id " + i + ": " + bookTitles[i]);
        }
    }

    public static void removeBook(String[] bookTitles, String removeTitle)
    {
        for (int i = 0; i < bookTitles.length; i++) {
            if (removeTitle.equals(bookTitles[i]))
                bookTitles[i] = null;
        }

        printBooks(bookTitles);
    }
}
