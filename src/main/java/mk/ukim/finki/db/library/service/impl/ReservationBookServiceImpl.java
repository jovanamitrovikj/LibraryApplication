package mk.ukim.finki.db.library.service.impl;

import mk.ukim.finki.db.library.model.*;
import mk.ukim.finki.db.library.model.exception.InvalidReservationBookIdException;
import mk.ukim.finki.db.library.repository.BookRepository;
import mk.ukim.finki.db.library.repository.MemberRepository;
import mk.ukim.finki.db.library.repository.ReservationBookRepository;
import mk.ukim.finki.db.library.service.ReservationBookService;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ReservationBookServiceImpl implements ReservationBookService {

    private final ReservationBookRepository reservationBookRepository;
    private final MemberRepository memberRepository;
    private final BookRepository bookRepository;

    public ReservationBookServiceImpl(ReservationBookRepository reservationBookRepository, MemberRepository memberRepository, BookRepository bookRepository) {
        this.reservationBookRepository = reservationBookRepository;
        this.memberRepository = memberRepository;
        this.bookRepository = bookRepository;
    }


    @Override
    public ReservationBook findById(Long id) {
        return this.reservationBookRepository.findById(id).orElseThrow(InvalidReservationBookIdException::new);
    }

    @Override
    public List<ReservationBook> listAll() {
        return this.reservationBookRepository.findAll();
    }

    @Override
    public ReservationBook reserveBook(Long memberId, Long bookId, Date takeDate, Date returnDate, boolean isReservedBook) {
        Person member = memberId!=null ? this.memberRepository.findById(memberId).orElse((Member) null) : null;
        Book book = bookId!=null ? this.bookRepository.findById(bookId).orElse((Book) null) : null;

        ReservationBook reservationBook = new ReservationBook((Member) member, book, takeDate, returnDate, isReservedBook);
        //TODO: treba da se zemat site izdanija od knigata, da se proveri dali ima slobodna i ako ima, od vkupnoto da se namali za edno

        return this.reservationBookRepository.save(reservationBook);
    }
}
