package COM187.Practicals.Week2;

import java.util.ArrayList;
import java.util.Scanner;

public class WordArrayList {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        words.add("Hello");
        words.add("World");
        words.add("My name is Melissa.");

        for(String w : words)
        {
            System.out.println(w);
        }

        System.out.println("Enter a location value to get the output: ");
        int location = input.nextInt();

        System.out.println(words.get(location));

        System.out.println(words.size());
    }
}
