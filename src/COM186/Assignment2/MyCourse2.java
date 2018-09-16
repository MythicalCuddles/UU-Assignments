package COM186.Assignment2;

public class MyCourse2 {

    /**************************************************************

     Project Name:   	Assignment 2
     File Name:         MyCourse2
     Created by: 	    Melissa Brennan (B00714027)
     Created on: 	    01 Mar 2017
     Comment: 	        Prints out information to screen about my course

     ***************************************************************/

    public static void main(String[] args)
    {
        // final variables
        final String _studentName = "Melissa Brennan";
        final String _attendance = "Part Time";
        final int _studentAge = 19;

        // declaring variables to be used
        int _moduleCode = 0;
        String _moduleName = "";
        String _tutorName = "";
        double _duration = 0.0;
        char _classType = 'A';

        // Prints the final variables to the screen
        System.out.println("Student Name: \t\t" + _studentName);
        System.out.println("Attendance: \t\t" + _attendance);
        System.out.println("Age: \t\t\t\t" + _studentAge);

        // Prints Module List message to screen after skipping a line
        System.out.println("");
        System.out.println("\t\tActive Module List");

        // Changing the values of the variables declared above to use in the messages below
        _moduleCode = 186;
        _moduleName = "Software Development I";
        _tutorName = "O. Nibouche";
        _duration = 2.0;
        _classType = 'L';

        // Using the variables declared and initialised within multiple strings to print messages to the screen (Using \t for tabbing and \n for new line)
        System.out.print("Module Code: \t\tCOM" + _moduleCode + "\n"
                + "Module Title: \t\t" + _moduleName + "\n"
                + "Tutor Name: \t\t" + _tutorName + "\n");
        System.out.println("Duration: \t\t\t" + _duration + " Hours");
        System.out.println("Class Type: \t\t" + _classType);

        // Adding a new line between modules
        System.out.println("");

        // Changing the values of the variables declared above to use in the messages below
        _moduleCode = 186;
        _moduleName = "Software Development I";
        _tutorName = "O. Nibouche";
        _duration = 2.0;
        _classType = 'C';

        // Using the variables declared and initialised within multiple strings to print messages to the screen (Using \t for tabbing and \n for new line)
        System.out.print("Module Code: \t\tCOM" + _moduleCode + "\n"
                + "Module Title: \t\t" + _moduleName + "\n"
                + "Tutor Name: \t\t" + _tutorName + "\n");
        System.out.println("Duration: \t\t\t" + _duration + " Hours");
        System.out.println("Class Type: \t\t" + _classType);

        // Adding a new line between modules
        System.out.println("");

        // Changing the values of the variables declared above to use in the messages below
        _moduleCode = 186;
        _moduleName = "Software Development I";
        _tutorName = "O. Nibouche";
        _duration = 2.0;
        _classType = 'C';

        // Using the variables declared and initialised within multiple strings to print messages to the screen (Using \t for tabbing and \n for new line)
        System.out.print("Module Code: \t\tCOM" + _moduleCode + "\n"
                + "Module Title: \t\t" + _moduleName + "\n"
                + "Tutor Name: \t\t" + _tutorName + "\n");
        System.out.println("Duration: \t\t\t" + _duration + " Hours");
        System.out.println("Class Type: \t\t" + _classType);
    }
}
