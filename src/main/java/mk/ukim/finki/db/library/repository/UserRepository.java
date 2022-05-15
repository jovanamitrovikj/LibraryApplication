package mk.ukim.finki.db.library.repository;

import mk.ukim.finki.db.library.model.Person;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@Primary
public interface UserRepository extends JpaRepository<Person, Long> {

    Optional<Person> findByEmailAndPassword(String email, String password);
}
