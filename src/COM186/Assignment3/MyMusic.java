package COM186.Assignment3;

public class MyMusic {

    /**************************************************************

     Filename: 		    MyMusic
     Created by: 		Melissa Brennan (B00714027)
     Created on: 		08 March 2017
     Comment: 		    Class Test - Task A

     ***************************************************************/

    public static void main(String[] args) {
        // Declare and Initialise Variables
        String _singer = "Ed Sheeran", _album = "รท (Divide)";
        final int _albumPublishYear = 2017;

        String[] _favouriteSongs = new String[]{
                "Castle on the Hill", "Shape of You", "Galway Girl"
        };

        // Prints out title to the output along with a line
        System.out.print("My Favourite Singer, Album and Songs\n");
        System.out.print("------------------------------------\n");

        // Prints favourite singer to the console
        System.out.print("Favourite Singer:\n\t");
        System.out.println(_singer);

        // Prints favourite album to the console
        System.out.println("Favourite Album:");
        System.out.print("\t");
        System.out.println(_album);

        // Prints the publish year of the album to the console
        System.out.println("Album Publish Year:");
        System.out.println("\t" + _albumPublishYear);

        // Prints my top 3 favourite songs to the console
        System.out.println("Favourite 3 Album Songs:");
        // Print out song names from string array
        System.out.print("1.\t" + _favouriteSongs[0] + "\n");
        System.out.print("2.\t" + _favouriteSongs[1] + "\n");
        System.out.print("3.\t" + _favouriteSongs[2] + "\n");
    }
}
