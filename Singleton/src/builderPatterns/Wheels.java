package builderPatterns;

class Wheels {
    int count;

    Wheels(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Wheels: " + count;
    }
}