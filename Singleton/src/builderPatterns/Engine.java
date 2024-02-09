package builderPatterns;

class Engine {
    String type;

    Engine(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Engine: " + type;
    }
}