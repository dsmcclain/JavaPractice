package db;

import models.Adopter;

import java.util.HashMap;
import java.util.Map;

public class AdopterDatabase {
    private static AdopterDatabase db = null;
    public Map<Integer, Adopter> list = new HashMap<>();
    public static synchronized AdopterDatabase getInstance() {
        if (db == null)
            db = new AdopterDatabase();

        return db;
    }
}