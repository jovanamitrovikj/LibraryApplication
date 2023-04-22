package mk.ukim.finki.db.library.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Inheritance(strategy = InheritanceType.JOINED)
@Entity
public class Person {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private String name;
    private String surname;
    private Date birthDate;
    private String address;
    private String town;
    private String phoneNumber;
    private String email;
    private String password;

    public Person(){ }

    public Person(String name, String surname, String address, String town, String phoneNumber, String email, String password) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.town = town;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.password = password;
    }
}
