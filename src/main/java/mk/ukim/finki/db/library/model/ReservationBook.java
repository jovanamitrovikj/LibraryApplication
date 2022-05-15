package mk.ukim.finki.db.library.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class ReservationBook {

    public ReservationBook(){}

    public ReservationBook(Date takeDate, Date returnDate, boolean isReservedBook) {
        this.takeDate = takeDate;
        this.returnDate = returnDate;
        this.isReservedBook = isReservedBook;
    }

    public ReservationBook(Member member, Book book, Date takeDate, Date returnDate, boolean isReservedBook) {
        this.member = member;
        this.book = book;
        this.takeDate = takeDate;
        this.returnDate = returnDate;
        this.isReservedBook = isReservedBook;
    }

    @Id
    @GeneratedValue
    private Long id;

    private Date takeDate;

    private Date returnDate;

    private boolean isReservedBook;

    @ManyToOne
    private Member member;

    @ManyToOne
    private Book book;

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Date getTakeDate() {
        return takeDate;
    }

    public void setTakeDate(Date takeDate) {
        takeDate = takeDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        returnDate = returnDate;
    }

    public boolean isReservedBook() {
        return isReservedBook;
    }

    public void setReservedBook(boolean reservedBook) {
        isReservedBook = reservedBook;
    }
}
