package L2_Additional;

public class l2MemoryStorage {
    
// ===============================
// METHOD AREA (JVM Memory)
// ===============================
// The class metadata is stored here:
// - class structure
// - method bytecode
// - static variables
// - field definitions

class Car {

    // INSTANCE VARIABLE
    // Stored inside the OBJECT in the HEAP
    String brand;

    // INSTANCE VARIABLE
    int year;

    // CONSTRUCTOR
    // Constructor code is stored in METHOD AREA
    // When called, its execution frame goes to the STACK
    Car(String b, int y) {
        brand = b;   // assigning values to instance variables in HEAP
        year = y;
    }

    // METHOD
    // Method code stored in METHOD AREA
    void display() {
        System.out.println(brand + " " + year);
    }
}

public class Main {

    // METHOD (entry point)
    public static void main(String[] args) {

        // ===============================
        // STACK MEMORY
        // ===============================

        // Local variable (reference)
        // Stored in STACK
        Car c1;

        // Object creation
        // ===============================
        // HEAP MEMORY
        // ===============================
        // new Car() creates an OBJECT in HEAP
        // Instance variables live here

        c1 = new Car("Toyota", 2020);

        /*
        MEMORY STATE:

        STACK:
        c1  ----->  reference to object

        HEAP:
        Car object
        brand = "Toyota"
        year = 2020
        */

        // Method call
        // A new stack frame is created
        c1.display();

    }
}

}
