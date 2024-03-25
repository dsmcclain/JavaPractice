package lib;

import db.AdopterDatabase;
import models.Adopter;
import models.Animal;
import models.AnimalType;
import org.junit.Before;
import org.junit.Test;
import org.mockito.MockedStatic;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import static java.util.Map.entry;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class TestAdopterService {
    AdopterDatabase adopterDatabase = mock(AdopterDatabase.class);
    Animal animal = new Animal(1, "Test Animal", AnimalType.TURTLE, "Box");
    Adopter adopter = new Adopter(1, "Test Adopter", 1234567, LocalDate.now(), animal);

    @Before
    public void initialize() {
        adopterDatabase.list = new HashMap<Integer, Adopter>(Map.ofEntries(entry(adopter.getId(), adopter)));
    }

    @Test
    public void TestGetByName() {
        try (MockedStatic<AdopterDatabase> adopterDatabaseMockedStatic = mockStatic(AdopterDatabase.class)) {
            when(AdopterDatabase.getInstance()).thenReturn(adopterDatabase);
            DBService adopterService = DBServiceFactory.create("Adopter");

            assertEquals(adopterService.getByName("Test Adopter"), adopter);
        }
    }

    @Test
    public void TestGetById() {

        try (MockedStatic<AdopterDatabase> adopterDatabaseMockedStatic = mockStatic(AdopterDatabase.class)) {
            when(AdopterDatabase.getInstance()).thenReturn(adopterDatabase);
            DBService adopterService = DBServiceFactory.create("Adopter");

            assertEquals(adopterService.getById(1), adopter);
        }
    }

    @Test
    public void TestUpdate() {

        try (MockedStatic<AdopterDatabase> adopterDatabaseMockedStatic = mockStatic(AdopterDatabase.class)) {
            when(AdopterDatabase.getInstance()).thenReturn(adopterDatabase);
            DBService adopterService = DBServiceFactory.create("Adopter");

            Adopter updatedAdopter = new Adopter(1, "New Name", 1234567, LocalDate.now(), animal);
            adopterService.update(updatedAdopter);

            assertEquals(adopterService.getById(1), updatedAdopter);

        }
    }

    @Test
    public void TestAdd() {

        try (MockedStatic<AdopterDatabase> adopterDatabaseMockedStatic = mockStatic(AdopterDatabase.class)) {
            when(AdopterDatabase.getInstance()).thenReturn(adopterDatabase);
            DBService adopterService = DBServiceFactory.create("Adopter");

            Adopter newAdopter = new Adopter(2, "New Person", 1234567, LocalDate.now(), animal);
            adopterService.add(newAdopter);

            assertEquals(adopterService.getById(2), newAdopter);
        }
    }

    @Test
    public void TestCount() {
        try (MockedStatic<AdopterDatabase> adopterDatabaseMockedStatic = mockStatic(AdopterDatabase.class)) {
            when(AdopterDatabase.getInstance()).thenReturn(adopterDatabase);
            DBService adopterService = DBServiceFactory.create("Adopter");

            assertEquals(adopterService.count(), 1);
            Adopter newAdopter = new Adopter(2, "New Person", 1234567, LocalDate.now(), animal);
            adopterService.add(newAdopter);

            assertEquals(adopterService.count(), 2);
        }
    }
}