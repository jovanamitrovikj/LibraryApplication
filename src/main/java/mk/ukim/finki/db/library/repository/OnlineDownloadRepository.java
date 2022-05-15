package mk.ukim.finki.db.library.repository;

import mk.ukim.finki.db.library.model.OnlineDownload;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OnlineDownloadRepository extends JpaRepository<OnlineDownload, Long> {
}
