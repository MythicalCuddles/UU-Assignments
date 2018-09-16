package COM187.Practicals.Week1;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a word:");
        String userInput = input.nextLine();

        System.out.println("You entered:");
        System.out.println(userInput);
    }
}
