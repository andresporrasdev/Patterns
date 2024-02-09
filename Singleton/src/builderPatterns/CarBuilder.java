package builderPatterns;

class CarBuilder implements VehicleBuilder {
    private Vehicle car = new Car();

    @Override
    public void buildEngine() {
        car.engine = new Engine("Car Engine");
    }

    @Override
    public void buildWheels() {
        car.wheels = new Wheels(4);
    }

    @Override
    public Vehicle getVehicle() {
        return car;
    }
}