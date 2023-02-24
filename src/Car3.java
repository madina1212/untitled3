public enum Car3 {
    SEDAN,
    HATCHBACK,
    CROSSOVER,
    SUV,
    UNIVERSAL, BodyType;

    public Car3 findByName(String name) {
        Car3 result = null;
        for (Car3 ignored : values()) {
            if (BodyType.name().equalsIgnoreCase(name)) {
                result = BodyType;
                break;
            }
        }
        return result;
    }

}
