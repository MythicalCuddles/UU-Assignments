package COM187.Assignment4;

public class Shadowmage extends Character {

    /*****************************************************

     Filename: 		    Shadowmage
     Created by: 		Melissa Brennan
     Student No:        B00714027
     Created on: 		06/12/2017
     Comment: 		    Assignment 4

     ******************************************************/

    private int magic;

    public Shadowmage() {
        super.setName(null);
        super.setHealth(0);
        magic = 0;
    }
    public Shadowmage(String name, int health, int magic) {
        super.setName(name);
        super.setHealth(health);

        this.magic = magic;
    }

    public int getMagic() { return magic; }
    public void setMagic(int magic) { this.magic = magic; }

    @Override
    public String toString()
    {
        return ("Shadowmage Name: " + super.getName() + "\nShadowmage Health: " + super.getHealth() + "\nShadowmage Magic: " + magic);
    }
}



