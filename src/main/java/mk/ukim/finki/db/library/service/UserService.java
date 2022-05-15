package mk.ukim.finki.db.library.service;

import mk.ukim.finki.db.library.model.Person;

import java.util.Date;

public interface UserService {

    Person register(String name, String surname, Date birthDate, String address, String town, String phoneNumber,
                     String email, String password);

    Person login(String username, String password);

}
