package lib;

import db.AdopterDatabase;
import models.Adopter;
import models.Entity;

import java.util.List;

public class AdopterService extends DBServiceImpl {

    private final List<Adopter> dataSource;
    public AdopterService() {
        dataSource = AdopterDatabase.getInstance().list;
    }
    public Adopter getByName(String name) {
        return (Adopter) getByName(dataSource, name);
    }

    public Adopter getById(int id) {
        return (Adopter) getById(dataSource, id);
    }

    // these methods need to accept Entity and then cast to Adopter because of type declaration in DBService
    public void add(Entity adopter) {
        dataSource.add((Adopter) adopter);
    }

    public void update(Entity adopter) {
        int index = dataSource.indexOf(getById(adopter.getId()));
        dataSource.set(index, (Adopter) adopter);
    }

    public int count() {
        return count(dataSource);
    }
}
