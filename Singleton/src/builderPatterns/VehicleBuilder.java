package builderPatterns;

interface VehicleBuilder {
    void buildEngine();
    void buildWheels();
    Vehicle getVehicle();
}