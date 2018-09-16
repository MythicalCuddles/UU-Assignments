package COM187.Practicals.Week5;

import java.util.Scanner;

public class UseStudent {
    public static void main(String[] args) {
        Student studentsArray[] = new Student[]{};

        Scanner input = new Scanner(System.in);

        System.out.println("How many students to you wish to add: ");
        int number = input.nextInt();
        input.nextLine();

        for(int i = 0; i < number; i++)
        {
            String tempName, tempModuleCode;
            double tempTestMark1, tempTestMark2;

            System.out.println("------------------------------");
            System.out.print("Enter Student Name: ");
            tempName = input.nextLine();
            System.out.print("Enter Module Code: ");
            tempModuleCode = input.nextLine();
            System.out.print("Enter Test 1 Mark: ");
            tempTestMark1 = input.nextDouble();
            System.out.print("Enter Test 2 Mark: ");
            tempTestMark2 = input.nextDouble();
            input.nextLine();
            System.out.println("------------------------------");

            studentsArray[i] = new Student(tempName, tempModuleCode, tempTestMark1, tempTestMark2);
        }

        for(Student s : studentsArray)
        {
            s.details();
        }

        System.out.println("\n\nSearch for users with Module Code: ");
        String searchModuleCode = input.nextLine();

        searchByModuleCode(studentsArray, searchModuleCode);
    }

    public static void searchByModuleCode(Student[] students, String ModuleCode){
        int location = 0;

        do {
            if (students[location].getModuleCode() == ModuleCode) {
                students[location].details();
            }

            location++;
        }
        while ((location < students.length));
    }
}


