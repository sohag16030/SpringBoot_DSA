package Java.DesignPattern;

// Abstract Product Interfaces
interface Vehicle {
    void manufacture();
}

interface Engine {
    void design();
}

// Concrete Product Classes for Cars
class Car implements Vehicle {
    @Override
    public void manufacture() {
        System.out.println("Manufacturing a car");
    }
}

class CarEngine implements Engine {
    @Override
    public void design() {
        System.out.println("Designing a car engine");
    }
}

// Concrete Product Classes for Motorcycles
class Motorcycle implements Vehicle {
    @Override
    public void manufacture() {
        System.out.println("Manufacturing a motorcycle");
    }
}

class MotorcycleEngine implements Engine {
    @Override
    public void design() {
        System.out.println("Designing a motorcycle engine");
    }
}

// Abstract Factory Interface
interface VehicleFactory {
    Vehicle createVehicle();
    Engine createEngine();
}

// Concrete Factories for Cars and Motorcycles
class CarFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }

    @Override
    public Engine createEngine() {
        return new CarEngine();
    }
}

class MotorcycleFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Motorcycle();
    }

    @Override
    public Engine createEngine() {
        return new MotorcycleEngine();
    }
}

// Client Code
public class AbstractFactoryPatternExample {
    public static void main(String[] args) {
        // Create a Car Factory
        VehicleFactory carFactory = new CarFactory();

        // Create a car and its engine
        Vehicle car = carFactory.createVehicle();
        Engine carEngine = carFactory.createEngine();

        // Manufacture and design the car and engine
        car.manufacture();
        carEngine.design();

        // Create a Motorcycle Factory
        VehicleFactory motorcycleFactory = new MotorcycleFactory();

        // Create a motorcycle and its engine
        Vehicle motorcycle = motorcycleFactory.createVehicle();
        Engine motorcycleEngine = motorcycleFactory.createEngine();

        // Manufacture and design the motorcycle and engine
        motorcycle.manufacture();
        motorcycleEngine.design();
    }
}
