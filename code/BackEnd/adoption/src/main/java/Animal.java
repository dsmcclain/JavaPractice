import org.apache.commons.lang3.Validate;

public class Animal {
    private String name;
    private AnimalType type;
    private String breed;

    public Animal(String name, AnimalType type) {
        init(name, type, null);
    }
    public Animal(String name, AnimalType type, String breed) {
        init(name, type, breed);
    }

    public void init(String name, AnimalType type, String breed) {
        Validate.notBlank(name, "Name cannot be blank");
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
