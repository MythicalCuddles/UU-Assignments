package COM187.Practicals.Week2;

import java.util.Scanner;

public class BookArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String bookTitles[] = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Please enter a title for Book id " + i + ": ");
            bookTitles[i] = input.nextLine();
        }

        for (int i = 0; i < bookTitles.length; i++) {
            System.out.println("Book Id " + i + ": " + bookTitles[i]);
        }

        System.out.println("Which book title would you like to remove?: ");
        String removeBookTitle = input.nextLine();

        for (int i = 0; i < bookTitles.length; i++) {
            if(removeBookTitle.equals(bookTitles[i]))
                bookTitles[i] = null;
        }

        for(String s : bookTitles)
            System.out.println(s);
    }
}
