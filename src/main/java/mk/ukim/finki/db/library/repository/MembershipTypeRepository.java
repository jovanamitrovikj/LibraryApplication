package mk.ukim.finki.db.library.repository;

import mk.ukim.finki.db.library.model.MembershipType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MembershipTypeRepository extends JpaRepository<MembershipType, Long> {
}
