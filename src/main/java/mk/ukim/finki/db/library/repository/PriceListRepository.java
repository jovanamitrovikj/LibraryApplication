package mk.ukim.finki.db.library.repository;

import mk.ukim.finki.db.library.model.PriceList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceListRepository extends JpaRepository<PriceList, Long> {
}
