package mk.ukim.finki.db.library.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Review {

    public Review(){}

    @Id
    @GeneratedValue
    private Long id;

    private int rentNumbers;

    private int rate;

    @ManyToOne
    private Book book;

    public int getRentNumbers() {
        return rentNumbers;
    }

    public void setRentNumbers(int rentNumbers) {
        rentNumbers = rentNumbers;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        rate = rate;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
