package mk.ukim.finki.db.library.service;

import mk.ukim.finki.db.library.model.Book;
import mk.ukim.finki.db.library.model.BookGenre;
import mk.ukim.finki.db.library.model.LibrariesEnum;

import java.util.List;

public interface BookService {

    List<Book> listAllBooks();

    Book findById(Long id);

    Book create(String bookName, int bookNumber, boolean isFree, int bookPrice, int bookPriceLate, BookGenre bookGenre, LibrariesEnum librariesEnum); //, List<Long> genreIds, List<Long> writerIds

    Book update(Long id, String bookName, int bookNumber, boolean isFree, int bookPrice, int bookPriceLate, List<Long> genreIds, List<Long> writerIds);

    Book delete(Long id);

}
