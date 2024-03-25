package models;

import org.apache.commons.lang3.Validate;

public class Animal implements Entity{
    private int id;
    private String name;
    private AnimalType type;
    private String breed;

    public Animal(int id, String name, AnimalType type) {
        init(id, name, type, null);
    }

    public Animal(int id, String name, AnimalType type, String breed) {
        init(id, name, type, breed);
    }

    public void init(int id, String name, AnimalType type, String breed) {
        Validate.notBlank(name, "Name cannot be blank");
        this.id = id;
        this.name = name;
        this.type = type;
        this.breed = breed;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getId() { return id; }

    public AnimalType getType() {
        return type;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public String toString() {
        return STR."Animal{id=\{id}, name='\{name}\{'\''}, type=\{type}, breed='\{breed}\{'\''}\{'}'}";
    }
}
