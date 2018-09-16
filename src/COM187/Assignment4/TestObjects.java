package COM187.Assignment4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.rmi.server.ExportException;
import java.util.ArrayList;
import java.util.Scanner;

public class TestObjects {

    /*****************************************************

     Filename: 		    TestObjects
     Created by: 		Melissa Brennan
     Student No:        B00714027
     Created on: 		06/12/2017
     Comment: 		    Assignment 4

     ******************************************************/

    ArrayList<Character> Characters = new ArrayList<>();

    private static Character[] characters = new Character[7];
    private static Shadowmage[] shadowmages = new Shadowmage[4];

    public static void main(String[] args) {

        int pos = 0;
        Scanner input = new Scanner(System.in);
        do
        {
            System.out.println("Please enter Character Name: ");
            String name = input.next();

            System.out.println("Please enter " + name + "'s health value: ");
            int health = input.nextInt();

            characters[pos] = new Character(name, health);

            pos++;
        }
        while  (pos < characters.length);

/*
        Character c = new Character("Mel", 100);
        System.out.println(c.toString());*/

        shadowmages[0] = new Shadowmage("Melissa", 100, 100);
        shadowmages[1] = new Shadowmage("Marceline", 100, 100);
        shadowmages[2] = new Shadowmage("Laura", 100, 100);
        shadowmages[3] = new Shadowmage("Amber", 100, 100);

        /*
        for(Shadowmage mages : shadowmages)
        {
            System.out.println(mages.toString());
        }
        */





        String fileName = "Shadowmages.txt";
        File f = new File(fileName);
        FileWriter writer;
        try {
            if(!f.exists())
            {
                if(f.createNewFile()){
                    System.out.println(fileName + " created.");
                }
            }

            writer = new FileWriter(fileName);
            for(Shadowmage mages : shadowmages)
            {
                writer.write(mages.toString() + "\n");
                System.out.println("Written to file: Shadowmage " + mages.getName() + ".");
            }
            writer.close();

        } catch(IOException e) {
            System.out.println(e.toString());
        } catch (Exception up) {
            throw up;
        }
    }
}
