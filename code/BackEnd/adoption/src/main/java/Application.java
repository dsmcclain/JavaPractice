import lib.DBService;
import lib.DBServiceFactory;
import models.Adopter;
import models.Animal;
import models.AnimalType;

import java.time.LocalDate;

public class Application {
    public void main(String[] args) {

        DBService adopterService = getDBService("Adopter");
        DBService animalService = getDBService("Animal");

        Animal animal = new Animal(1, "Agnes", AnimalType.TURTLE, "box");
        animalService.add(animal);
        adopterService.add(new Adopter(1, "Terry", 1234567, LocalDate.now(), (Animal) animalService.getByName("Agnes")));

        System.out.println(adopterService.getByName("Terry"));
        System.out.println(animalService.getByName("Agnes"));
        System.out.println(adopterService.getAll());
    }

    public DBService getDBService(String type) {
        return DBServiceFactory.create(type);
    }
}
