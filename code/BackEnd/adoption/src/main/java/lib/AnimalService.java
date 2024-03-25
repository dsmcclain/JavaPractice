package lib;

import db.AnimalDatabase;
import models.Animal;
import models.Entity;

import java.util.List;

public class AnimalService extends DBServiceImpl {
    private final List<Animal> dataSource;

    public AnimalService() {
        dataSource = AnimalDatabase.getInstance().list;
    }

    public Animal getByName(String name) {
        return (Animal) getByName(dataSource, name);
    }

    public Animal getById(int id) {
        return (Animal) getById(dataSource, id);
    }

    // need to accept Entity and then cast to Animal because of type declaration in DBService
    public void add(Entity animal) {
        dataSource.add((Animal) animal);
    }

    public void update(Entity animal) {
        int index = dataSource.indexOf(getById(animal.getId()));
        dataSource.set(index, (Animal) animal);
    }

    public int count() {
        return count(dataSource);
    }
}
