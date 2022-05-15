package mk.ukim.finki.db.library.repository;

import mk.ukim.finki.db.library.model.SchoolType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolTypeRepository extends JpaRepository<SchoolType, Long> {
}
