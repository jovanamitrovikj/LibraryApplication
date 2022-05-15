package mk.ukim.finki.db.library.repository;

import mk.ukim.finki.db.library.model.ReservationPlace;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationPlaceRepository extends JpaRepository<ReservationPlace, Long> {
}
