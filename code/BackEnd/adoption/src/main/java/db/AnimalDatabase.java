package db;

import models.Animal;

import java.util.ArrayList;
import java.util.List;

public class AnimalDatabase {
    private static AnimalDatabase db = null;
    public List<Animal> list;
    private AnimalDatabase() {
        list = new ArrayList<>(List.of());
    }
    public static synchronized AnimalDatabase getInstance() {
        if (db == null)
            db = new AnimalDatabase();

        return db;
    }
}