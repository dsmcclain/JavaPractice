package lib;

import db.AnimalDatabase;
import models.Animal;
import models.Entity;

import java.util.Map;

public class AnimalService implements DBService {
    private final Map<Integer, Animal> dataSource;
    public Map<Integer, Animal> getDataSource() { return this.dataSource; }
    public AnimalService(AnimalDatabase dataSource) {
        this.dataSource = dataSource.list;
    }
    public Animal getByName(String name) {
        Map.Entry<Integer, Animal> result = dataSource.entrySet().stream()
                .filter(a -> a.getValue().getName().equals(name))
                .findFirst()
                .orElse(null);
        return result != null ?  result.getValue() : null;
    }
    public Animal getById(int id) {
        return dataSource.get(id);
    }

    // need to accept Entity and then cast to Animal because of type declaration in DBService
    public void add(Entity animal) {
        dataSource.put(animal.getId(), (Animal) animal);
    }

    public void update(Entity animal) {
        dataSource.replace(animal.getId(),(Animal) animal);
    }
}
