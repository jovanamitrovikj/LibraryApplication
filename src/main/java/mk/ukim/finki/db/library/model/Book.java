package mk.ukim.finki.db.library.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Book {

    public Book(){}

    public Book(String bookName, int bookNumber, boolean isFree, int bookPrice, int bookPriceLate) {
        this.bookName = bookName;
        this.bookNumber = bookNumber;
        this.isFree = isFree;
        this.bookPrice = bookPrice;
        this.bookPriceLate = bookPriceLate;
    }

    public Book(String bookName, int bookNumber, boolean isFree, int bookPrice, int bookPriceLate, List<Genre> genres, List<Writer> writers) {
        this.bookName = bookName;
        this.bookNumber = bookNumber;
        this.isFree = isFree;
        this.bookPrice = bookPrice;
        this.bookPriceLate = bookPriceLate;
        this.genre = (Genre) genres;
        this.writers = writers;
    }

    public Book(String bookName, int bookNumber, boolean isFree, int bookPrice, int bookPriceLate, Library library) {
        this.bookName = bookName;
        this.bookNumber = bookNumber;
        this.isFree = isFree;
        this.bookPrice = bookPrice;
        this.bookPriceLate = bookPriceLate;
        this.library = library;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String bookName;

    private int bookNumber;

    private boolean isFree;

    private int bookPrice;

    private int bookPriceLate;

    @ManyToOne
    private Library library;

    @ManyToOne
    private Genre genre;

    @ManyToMany
    private List<Writer> writers;

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public List<Writer> getWriters() {
        return writers;
    }

    public void setWriters(List<Writer> writers) {
        this.writers = writers;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        bookName = bookName;
    }

    public int getBookNumber() {
        return bookNumber;
    }

    public void setBookNumber(int bookNumber) {
        bookNumber = bookNumber;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }

    public int getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(int bookPrice) {
        bookPrice = bookPrice;
    }

    public int getBookPriceLate() {
        return bookPriceLate;
    }

    public void setBookPriceLate(int bookPriceLate) {
        bookPriceLate = bookPriceLate;
    }
}
