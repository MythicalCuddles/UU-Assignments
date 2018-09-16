package COM187.Practicals.Week1;

public class Car {
    private String model;
    private int yearOfManufacture;
    private double price;

    private static int totalNoOfCars;

    public Car(String model, int yearOfManufacture, double price)
    {
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
        this.price = price;

        totalNoOfCars++;
    }

    public void displayDetails()
    {
        System.out.println("Car Model: " + model);
        System.out.println("Year Manufactured: " + yearOfManufacture);
        System.out.println("Price: €" + price);
    }

    public static int getTotalNoOfCars()
    {
        return totalNoOfCars;
    }
}
