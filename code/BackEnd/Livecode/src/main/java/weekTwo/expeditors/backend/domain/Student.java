package weekTwo.expeditors.backend.domain;

import org.apache.commons.lang3.Validate;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.security.InvalidParameterException;
import java.time.LocalDate;

public class Student {
    private int id;
    private String name;
    private LocalDate dob;
    private String email;

    public Student(int id, String name, LocalDate dob, String email) {
        Validate.notNull(name, "need a name bro");
        setId(id);
        setName(name);
        setDob(dob);
        setEmail(email);
    }

    // no "static" keyword so these are instance methods
    // they pass an implicit 'this' pointer as the first argument, so `return id` == `return this.id`
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

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(!email.matches(".*@.*")) {
            throw new InvalidParameterException("That aint an email: " + email);
        }
        this.email = email;
    }

    public String toString() {
        return new ToStringBuilder(this).
            append("name", name).
            append("date of birth", dob).
            append("email", email).
            append("id", id).
            toString();
    }

}
