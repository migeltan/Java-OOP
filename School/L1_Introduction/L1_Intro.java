public class L1_Intro {

    // Attributes
    private String brand; //instance variable - heap
    private String model;
    private int year;

    // Constructor
    public L1_Intro(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Year: " + year);
    }

    public static void main(String[] args) {
        L1_Intro myCar = new L1_Intro("Toyota", "Corolla", 2022);
        myCar.displayDetails();

        L1_Intro anotherCar = new L1_Intro("Honda", "Civic", 2024);
        anotherCar.displayDetails();

        L1_Intro anotherCar1 = new L1_Intro("Toyota", "Innova", 2006);
        anotherCar1.displayDetails(); // calls method by referencing the class above.
    }
}
/*
Notes during the lab:


*/