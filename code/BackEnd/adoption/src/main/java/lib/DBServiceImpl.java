package lib;

import models.Entity;

import java.util.List;

public abstract class DBServiceImpl implements DBService {
    public abstract Entity getByName(String name);
    public Entity getByName(List<? extends Entity> dataSource, String name) {
        return dataSource.stream()
                .filter(e -> name.equals(e.getName()))
                .findFirst()
                .orElse(null);
    }

    public abstract Entity getById(int id);
    public Entity getById(List<? extends Entity> dataSource, int id) {
        return dataSource.stream()
                .filter(e -> id == e.getId())
                .findFirst()
                .orElse(null);
    }
    public int count(List<? extends Entity> dataSource) {
        return dataSource.size();
    };
    public abstract void add(Entity entity);
    public abstract void update(Entity entity);
}
