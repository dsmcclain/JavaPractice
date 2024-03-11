public class Animal {
    private final String name;
    private final AnimalType type;
    private final String breed;

    public Animal(String name, AnimalType type, String breed) {
        this.name = name;
        this.type = type;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public AnimalType getType() {
        return type;
    }

    public String getBreed() {
        return breed;
    }
}
