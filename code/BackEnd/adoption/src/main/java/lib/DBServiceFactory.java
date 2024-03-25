package lib;

import org.apache.commons.lang3.NotImplementedException;

public interface DBServiceFactory {
   public static DBService create(String serviceType) {
       if (serviceType.equals("Animal"))
           return new AnimalService();
       else if (serviceType.equals("Adopter"))
           return new AdopterService();
       else
           throw new NotImplementedException(STR."Type '\{serviceType}' is not supported.");
   }
}
