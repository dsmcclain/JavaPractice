package lib;

import models.Entity;

public interface DBService {
    public Entity getByName(String name);
    public Entity getById(int id);
    public int count();
    public void add(Entity entity);
    public void update(Entity entity);
}
