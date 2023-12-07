class Vehicle {
    void start() {
        System.out.println("Vehicle started");
    }

    void stop() {
        System.out.println("Vehicle stopped");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving");
    }
}

class Motorcycle extends Vehicle {
    void ride() {
        System.out.println("Motorcycle is riding");
    }
}

public class hierachical {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.drive();
        car.stop();

        System.out.println();

        Motorcycle motorcycle = new Motorcycle();
        motorcycle.start();
        motorcycle.ride();
        motorcycle.stop();
    }
}

