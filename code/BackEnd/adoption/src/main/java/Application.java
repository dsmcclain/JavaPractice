import lib.DBService;
import lib.DBServiceFactory;
import models.Adopter;
import models.Animal;
import models.AnimalType;

import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        DBService adopterService = DBServiceFactory.create("Adopter");
        System.out.println(adopterService.getByName(("Test")));


        DBService animalService = DBServiceFactory.create("Animal");
        System.out.println(animalService.getByName(("Filbert")));
        Animal animal = new Animal(2, "Filberto", AnimalType.TURTLE, "box");
        animalService.add(animal);
        adopterService.add(new Adopter(1, "Terry", 1234567, LocalDate.now(), (Animal) animalService.getByName("Filberto")));
        System.out.println(adopterService.getByName("Terry"));
        System.out.println(animalService.getByName("Filberto"));
    }
}
