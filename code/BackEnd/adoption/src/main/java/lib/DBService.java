package lib;

import models.Entity;

import java.util.Map;

public interface DBService {
    public Entity getByName(String name);
    public Entity getById(int id);
    public default Map<Integer, ? extends Entity> getAll() {
        return getDataSource();
    };
    public Map<Integer, ? extends Entity> getDataSource();
    public default int count() {
        return getDataSource().size();
    };
    public void add(Entity entity);
    public void update(Entity entity);
}
