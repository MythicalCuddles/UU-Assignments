package COM187.Assignment4;

public class Character {

    /*****************************************************

     Filename: 		    Character
     Created by: 		Melissa Brennan
     Student No:        B00714027
     Created on: 		06/12/2017
     Comment: 		    Assignment 4

     ******************************************************/

    private String name;
    private int health;

    public void setName(String name) { this.name = name; }
    public void setHealth(int health) { this.health = health; }

    public String getName() { return name; }
    public int getHealth() { return health; }

    public Character() {
        name = null;
        health = 0;
    }

    public Character(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String toString()
    {
        return ("Character Name: " + name + "\nCharacter Health: " + health);
    }
}
