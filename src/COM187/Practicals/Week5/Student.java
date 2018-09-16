package COM187.Practicals.Week5;

public class Student {
    private String studentName, moduleCode;
    private double test1Mark, test2Mark;

    private static int noOfStudents;

    public Student(String Name, String ModuleCode, double TestMark1, double TestMark2)
    {
        studentName = Name;
        moduleCode = ModuleCode;

        test1Mark = TestMark1;
        test2Mark = TestMark2;

        noOfStudents++;
    }

    private double calculateAverage()
    {
        return ((test1Mark + test2Mark) / 2);
    }

    public void details()
    {
        System.out.println("Student: " + studentName);
        System.out.println("Test 1 Mark for " + studentName + ": " + test1Mark);
        System.out.println("Test 2 Mark for " + studentName + ": " + test2Mark);
        System.out.println("Average Mark for " + studentName + ": " + calculateAverage());
    }

    public String getModuleCode()
    {
        return moduleCode;
    }


    public static int getNoOfStudents()
    {
        return noOfStudents;
    }
}
