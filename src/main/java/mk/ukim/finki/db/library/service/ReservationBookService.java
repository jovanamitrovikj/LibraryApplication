package mk.ukim.finki.db.library.service;

import mk.ukim.finki.db.library.model.Book;
import mk.ukim.finki.db.library.model.Person;
import mk.ukim.finki.db.library.model.ReservationBook;

import java.util.Date;
import java.util.List;

public interface ReservationBookService {

    ReservationBook findById(Long id);

    List<ReservationBook> listAll();

    ReservationBook reserveBook(Long memberId, Long bookId, Date takeDate, Date returnDate, boolean isReservedBook);
}
