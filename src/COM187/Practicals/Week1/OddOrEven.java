package COM187.Practicals.Week1;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int userNum = input.nextInt();

        if(userNum % 2 == 0)
            System.out.println("The number " + userNum + " is Even.");
        else
            System.out.println("The number " + userNum + " is Odd.");
    }
}