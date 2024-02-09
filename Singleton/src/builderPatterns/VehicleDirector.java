package builderPatterns;

class VehicleDirector {
    private VehicleBuilder builder;

    VehicleDirector(VehicleBuilder builder) {
        this.builder = builder;
    }

    void construct() {
        builder.buildEngine();
        builder.buildWheels();
    }
}