package builderPatterns;

class Motorcycle extends Vehicle {
    Motorcycle() {
        type = "Motorcycle";
    }

    @Override
    void start() {
        System.out.println("Motorcycle going forward...");
    }

    @Override
    void stop() {
        System.out.println("Motorcycle backward...");
    }
}