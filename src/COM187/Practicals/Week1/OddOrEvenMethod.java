package COM187.Practicals.Week1;

import java.util.Scanner;

public class OddOrEvenMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int userNum = input.nextInt();

        StateWholeNumberStatus(userNum);
    }

    public static void StateWholeNumberStatus(int num) {
        if(num % 2 == 0)
            System.out.println("The number " + num + " is Even.");
        else
            System.out.println("The number " + num + " is Odd.");
    }
}

