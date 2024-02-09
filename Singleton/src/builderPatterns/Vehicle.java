package builderPatterns;

abstract class Vehicle {
    String type;
    Engine engine;
    Wheels wheels;

    abstract void start();
    abstract void stop();

    @Override
    public String toString() {
        return "Type: " + type + "\n" + engine + "\n" + wheels;
    }
}