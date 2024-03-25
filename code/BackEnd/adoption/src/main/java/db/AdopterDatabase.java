package db;

import models.Adopter;
import models.Animal;
import models.AnimalType;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AdopterDatabase {
    private static AdopterDatabase db = null;
    public List<Adopter> list;
    private AdopterDatabase() {
        Animal animal = new Animal(1, "Filbert", AnimalType.TURTLE, "box");
        list = new ArrayList<>(List.of(new Adopter(1, "John Doe", 1234567, LocalDate.now(), animal)));
    }
    public static synchronized AdopterDatabase getInstance() {
        if (db == null)
            db = new AdopterDatabase();

        return db;
    }
}
//public class AdopterDatabase {
//    private static AdopterDatabase db = null;
//
//    public List<Adopter> adopterList;
//
//    private AdopterDatabase() {
//        adopterList = List.of(
//            new Adopter(1, "Test", 1234567, LocalDate.now(), getDefaultAnimal())
//        );
//    }
//
//    public void add(Adopter adopter) {
//        getInstance().adopterList.add(adopter);
//    }
//
//    public static synchronized AdopterDatabase getInstance() {
//        if (db == null)
//            db = new AdopterDatabase();
//
//        return db;
//    }
//    public static Animal getDefaultAnimal() {
//        AnimalService animalService = new AnimalService();
//        return (Animal) animalService.getByName("Filbert");
//    }
//}