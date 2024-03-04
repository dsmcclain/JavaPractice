package weekTwo.expeditors.backend.app;

import org.apache.commons.lang3.builder.ToStringBuilder;
import weekTwo.expeditors.backend.domain.Student;

import java.time.LocalDate;

public class StudentApp {
    public static void main(String[] args) {
        Student s = new Student(12, "me", LocalDate.of(1985, 11, 1), "fake@example.com");

        System.out.println(ToStringBuilder.reflectionToString(s));
    }


}
