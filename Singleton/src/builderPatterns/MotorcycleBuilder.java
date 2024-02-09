package builderPatterns;

class MotorcycleBuilder implements VehicleBuilder {
    private Vehicle motorcycle = new Motorcycle();

    @Override
    public void buildEngine() {
        motorcycle.engine = new Engine("Motorcycle Engine");
    }

    @Override
    public void buildWheels() {
        motorcycle.wheels = new Wheels(2);
    }

    @Override
    public Vehicle getVehicle() {
        return motorcycle;
    }
}