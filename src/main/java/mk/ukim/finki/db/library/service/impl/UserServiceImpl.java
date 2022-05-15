package mk.ukim.finki.db.library.service.impl;

import mk.ukim.finki.db.library.model.Person;
import mk.ukim.finki.db.library.model.exception.InvalidArgumentsException;
import mk.ukim.finki.db.library.model.exception.InvalidUserCredentialsException;
import mk.ukim.finki.db.library.model.exception.InvalidUsernameOrPasswordException;
import mk.ukim.finki.db.library.repository.MemberRepository;
import mk.ukim.finki.db.library.repository.UserRepository;
import mk.ukim.finki.db.library.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Person register(String name, String surname, Date birthDate, String address, String town, String phoneNumber,
                            String email, String password) { //SchoolType schoolType, MembershipType membershipType,

        Person member = new Person(name, surname, birthDate, address, town, phoneNumber, email, password);

        return this.userRepository.save(member);
    }

    @Override
    public Person login(String email, String password) {
        if (email==null || email.isEmpty() || password==null || password.isEmpty()) {
            throw new InvalidUsernameOrPasswordException();
        }
        return userRepository.findByEmailAndPassword(email, password).orElseThrow(InvalidUserCredentialsException::new);
    }
}
