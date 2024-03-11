import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        var adopter1 = new Adopter(
                2,"Jeremy",  1234567, LocalDate.now(), AnimalDatabase.getAnimal("Filbert")
        );
        System.out.println(adopter1);
    }
}
