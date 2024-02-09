package builderPatterns;

class Car extends Vehicle {
    Car() {
        type = "Car";
    }

    @Override
    void start() {
        System.out.println("Car going forward...");
    }

    @Override
    void stop() {
        System.out.println("Car going backward...");
    }
}