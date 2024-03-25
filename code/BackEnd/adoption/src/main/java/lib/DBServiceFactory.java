package lib;

import db.AdopterDatabase;
import db.AnimalDatabase;
import org.apache.commons.lang3.NotImplementedException;

public class DBServiceFactory {
    public static DBService create(String type) {
        if (type.equals("Adopter")) {
            return new AdopterService(AdopterDatabase.getInstance());
        } else if (type.equals("Animal")) {
            return new AnimalService(AnimalDatabase.getInstance());
        } else {
            throw new NotImplementedException(STR." Type \{type} is not supported");
        }
    }
}