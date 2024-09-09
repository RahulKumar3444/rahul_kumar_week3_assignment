// Base class
class Vehicle {
    public void move() {
        System.out.println("The vehicle is moving.");
    }
}

// Derived class: Car
class Car extends Vehicle {
    @Override
    public void move() {
        System.out.println("The car is driving on the road.");
    }
}

// Derived class: Bike
class Bike extends Vehicle {
    @Override
    public void move() {
        System.out.println("The bike is riding on the road.");
    }
}

// This class contains the main() method and can be named anything, here it's named 'Test'
public class Test {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myBike = new Bike();

        myCar.move();  // Output: The car is driving on the road.
        myBike.move(); // Output: The bike is riding on the road.

        Vehicle genericVehicle = new Vehicle();
        genericVehicle.move(); // Output: The vehicle is moving.
    }
}

