package db;

import models.Animal;

import java.util.HashMap;
import java.util.Map;

public class AnimalDatabase {
    private static AnimalDatabase db = null;
    public Map<Integer, Animal> list = new HashMap<>();
    public static synchronized AnimalDatabase getInstance() {
        if (db == null)
            db = new AnimalDatabase();

        return db;
    }
}