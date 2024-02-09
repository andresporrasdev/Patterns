package builderPatterns;

public class Main {
    public static void main(String[] args) {
        // Using Builder pattern to create instances of different vehicles
        VehicleBuilder carBuilder = new CarBuilder();
        VehicleDirector carDirector = new VehicleDirector(carBuilder);
        carDirector.construct();
        Vehicle car = carBuilder.getVehicle();

        VehicleBuilder motorcycleBuilder = new MotorcycleBuilder();
        VehicleDirector motorcycleDirector = new VehicleDirector(motorcycleBuilder);
        motorcycleDirector.construct();
        Vehicle motorcycle = motorcycleBuilder.getVehicle();

        System.out.println("Car:");
        System.out.println(car);

        System.out.println("Motorcycle:");
        System.out.println(motorcycle);
    }
}