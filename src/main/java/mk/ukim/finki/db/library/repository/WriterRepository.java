package mk.ukim.finki.db.library.repository;

import mk.ukim.finki.db.library.model.Writer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WriterRepository extends JpaRepository<Writer, Long> {
}
