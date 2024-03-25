package lib;

import db.AdopterDatabase;
import models.Adopter;
import models.Entity;

import java.util.Map;

public class AdopterService implements DBService{

    private final Map<Integer, Adopter> dataSource;
    public Map<Integer, Adopter> getDataSource() { return this.dataSource; }
    public AdopterService(AdopterDatabase dataSource) {
        this.dataSource = dataSource.list;
    }
    public Adopter getByName(String name) {
        Map.Entry<Integer, Adopter> result = dataSource.entrySet().stream()
                .filter(a -> a.getValue().getName().equals(name))
                .findFirst()
                .orElse(null);
        return result != null ?  result.getValue() : null;
    }

    public Adopter getById(int id) {
        return dataSource.get(id);
    }

    // these methods need to accept Entity and then cast to Adopter because of type declaration in DBService
    public void add(Entity adopter) {
        dataSource.put(adopter.getId(), (Adopter) adopter);
    }

    public void update(Entity adopter) {
        dataSource.replace(adopter.getId(), (Adopter) adopter);
    }
}
