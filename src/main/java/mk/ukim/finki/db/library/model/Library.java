package mk.ukim.finki.db.library.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Library {

    public Library() {
        books = new ArrayList<Book>();
    }

    public Library(String libraryName, String libraryCity) {
        this.libraryName = libraryName;
        this.libraryCity = libraryCity;
        books = new ArrayList<Book>();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String libraryName;

    private String libraryCity;

    @OneToMany(mappedBy = "library")
    private List<Book> books;

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public void setLibraryCity(String libraryCity) {
        this.libraryCity = libraryCity;
    }
}
