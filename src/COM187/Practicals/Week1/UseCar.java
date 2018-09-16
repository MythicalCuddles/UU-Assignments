package COM187.Practicals.Week1;

public class UseCar {
    public static void main(String[] args) {
        Car c1 = new Car("Toyota Yaris",2017,14341.27);
        Car c2 = new Car("Smart ForTwo", 2017, 11341.40);

        c1.displayDetails();
        c2.displayDetails();

        System.out.println("Total number of cars: " + Car.getTotalNoOfCars());
    }
}
