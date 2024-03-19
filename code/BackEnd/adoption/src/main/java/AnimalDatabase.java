import java.util.Map;

public class AnimalDatabase {
    private static final Map<String, Animal> AnimalMap = Map.of(
        "Jesse", new Animal("Jesse", AnimalType.DOG, "Hound"),
        "Filbert", new Animal("Filbert", AnimalType.TURTLE, "Box")
    );

    public static Animal getAnimal(String animalName) {
        return AnimalMap.get(animalName);
    }

}
