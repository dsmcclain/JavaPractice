package lib;

import db.AnimalDatabase;
import models.Animal;
import models.AnimalType;
import org.junit.Before;
import org.junit.Test;
import org.mockito.MockedStatic;

import java.util.HashMap;
import java.util.Map;

import static java.util.Map.entry;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class TestAnimalService {
    AnimalDatabase animalDatabase = mock(AnimalDatabase.class);
    Animal animal = new Animal(1, "Test Animal", AnimalType.TURTLE, "Box");

    @Before
    public void initialize() {
        animalDatabase.list = new HashMap<Integer, Animal>  (Map.ofEntries(entry(animal.getId(), animal)));
    }

    @Test
    public void TestGetByName() {
        try (MockedStatic<AnimalDatabase> animalDatabaseStaticMock = mockStatic(AnimalDatabase.class)) {
            when(AnimalDatabase.getInstance()).thenReturn(animalDatabase);
            DBService animalService = DBServiceFactory.create("Animal");

            assertEquals(animalService.getByName("Test Animal"), animal);
        }
    }

    @Test
    public void TestGetById() {

        try (MockedStatic<AnimalDatabase> animalDatabaseMockedStatic = mockStatic(AnimalDatabase.class)) {
            when(AnimalDatabase.getInstance()).thenReturn(animalDatabase);
            DBService animalService = DBServiceFactory.create("Animal");

            assertEquals(animalService.getById(1), animal);
        }
    }

    @Test
    public void TestUpdate() {

        try (MockedStatic<AnimalDatabase> animalDatabaseMockedStatic = mockStatic(AnimalDatabase.class)) {
            when(AnimalDatabase.getInstance()).thenReturn(animalDatabase);
            DBService animalService = DBServiceFactory.create("Animal");

            Animal updatedAnimal = new Animal(1, "New Animal Name", AnimalType.DOG);
            animalService.update(updatedAnimal);

            assertEquals(animalService.getById(1), updatedAnimal);

        }
    }

    @Test
    public void TestAdd() {

        try (MockedStatic<AnimalDatabase> animalDatabaseMockedStatic = mockStatic(AnimalDatabase.class)) {
            when(AnimalDatabase.getInstance()).thenReturn(animalDatabase);
            DBService animalService = DBServiceFactory.create("Animal");

            Animal newAnimal = new Animal(2, "New Animal", AnimalType.CAT);
            animalService.add(newAnimal);

            assertEquals(animalService.getById(2), newAnimal);
        }
    }

    @Test
    public void TestCount() {
        try (MockedStatic<AnimalDatabase> animalDatabaseMockedStatic = mockStatic(AnimalDatabase.class)) {
            when(AnimalDatabase.getInstance()).thenReturn(animalDatabase);
            DBService animalService = DBServiceFactory.create("Animal");

            assertEquals(animalService.count(), 1);
            Animal newAnimal = new Animal(2, "New Animal", AnimalType.CAT);
            animalService.add(newAnimal);

            assertEquals(animalService.count(), 2);
        }
    }
}