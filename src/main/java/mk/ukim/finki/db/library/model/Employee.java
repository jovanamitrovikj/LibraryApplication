package mk.ukim.finki.db.library.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Employee extends Person {

    public Employee(){ }

    public Employee(String position) {
        this.position = position;
    }

    private String position;

    @ManyToOne
    private Library library;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        position = position;
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }
}
