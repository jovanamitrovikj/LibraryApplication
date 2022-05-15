package mk.ukim.finki.db.library.repository;

import mk.ukim.finki.db.library.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    //TODO: listBooksByName, listBooksByNameAndGenre, listBooksByNameAndGenreAndWriter, listBooksByNameAndWriter
    //TODO: listBooksByGenre, listBooksByWriter
}
