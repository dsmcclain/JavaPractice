import org.apache.commons.lang3.Validate;

import java.time.LocalDate;

public class Adopter {
    private int id;
    private String name;
    private int phoneNumber;
    private LocalDate adoptionDate;
    private AnimalType petType;
    private String petName;
    private String petBreed;

    @java.lang.Override
    public java.lang.String toString() {
        return STR."""
                Adopter{id=\{id}, name='\{name}', phoneNumber=\{phoneNumber}, \
                adoptionDate=\{adoptionDate}, petType=\{petType.toString()}, \
                petName='\{petName}', petBreed='\{petBreed}'}
               """;

    }

    public Adopter(int id, String name, int phoneNumber, LocalDate adoptionDate, Animal animal) {
        Validate.isTrue(id > 0, "ID must be a positive integer");
        Validate.notBlank(name, "Name cannot be blank");
        Validate.notNull(animal, "Animal cannot be null");
        Validate.inclusiveBetween(1000000,9999999, phoneNumber, "Phone number must be 7 digits");
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.adoptionDate = adoptionDate;
        this.petType = animal.getType();
        this.petName = animal.getName();
        this.petBreed = animal.getBreed();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalDate getAdoptionDate() {
        return adoptionDate;
    }

    public void setAdoptionDate(LocalDate adoptionDate) {
        this.adoptionDate = adoptionDate;
    }

    public AnimalType getPetType() {
        return petType;
    }

    public void setPetType(AnimalType petType) {
        this.petType = petType;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getPetBreed() {
        return petBreed;
    }

    public void setPetBreed(String petBreed) {
        this.petBreed = petBreed;
    }



}
