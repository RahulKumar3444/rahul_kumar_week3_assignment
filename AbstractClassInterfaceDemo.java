// Interface Declaration
interface Vehicle {
    void start();  // abstract method
    void stop();   // abstract method
}

// Abstract Class Declaration
abstract class Car implements Vehicle {
    String model;
    
    Car(String model) {
        this.model = model;
    }

    // Abstract method to be implemented by subclasses
    abstract void displayInfo();

    // A concrete method
    public void start() {
        System.out.println("Car is starting...");
    }

    // A concrete method
    public void stop() {
        System.out.println("Car is stopping...");
    }
}

// Subclass of the abstract class Car
class Sedan extends Car {

    Sedan(String model) {
        super(model);
    }

    // Implementation of abstract method
    @Override
    void displayInfo() {
        System.out.println("This is a Sedan. Model: " + model);
    }
}

// Another subclass of the abstract class Car
class SUV extends Car {

    SUV(String model) {
        super(model);
    }

    // Implementation of abstract method
    @Override
    void displayInfo() {
        System.out.println("This is an SUV. Model: " + model);
    }
}

// Main class to test the program
public class AbstractClassInterfaceDemo {
    public static void main(String[] args) {
        // Create objects of Sedan and SUV
        Car mySedan = new Sedan("Honda City");
        Car mySUV = new SUV("Toyota Fortuner");

        // Call methods on Sedan
        mySedan.start();
        mySedan.displayInfo();
        mySedan.stop();

        System.out.println();

        // Call methods on SUV
        mySUV.start();
        mySUV.displayInfo();
        mySUV.stop();
    }
}

