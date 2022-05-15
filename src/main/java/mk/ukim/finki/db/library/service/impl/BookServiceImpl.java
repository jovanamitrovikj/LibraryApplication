package mk.ukim.finki.db.library.service.impl;

import mk.ukim.finki.db.library.model.*;
import mk.ukim.finki.db.library.model.exception.InvalidBookIdException;
import mk.ukim.finki.db.library.repository.BookRepository;
import mk.ukim.finki.db.library.repository.GenreRepository;
import mk.ukim.finki.db.library.repository.WriterRepository;
import mk.ukim.finki.db.library.service.BookService;
import mk.ukim.finki.db.library.service.LibraryService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;
    private final WriterRepository writerRepository;
    private final GenreRepository genreRepository;

    public BookServiceImpl(BookRepository bookRepository, WriterRepository writerRepository, GenreRepository genreRepository, LibraryService libraryService) {
        this.bookRepository = bookRepository;
        this.writerRepository = writerRepository;
        this.genreRepository = genreRepository;
    }

    @Override
    public List<Book> listAllBooks() {
        return this.bookRepository.findAll();
    }

    @Override
    public Book findById(Long id) {
        return this.bookRepository.findById(id).orElseThrow(InvalidBookIdException::new);
    }

    @Override
    public Book create(String bookName, int bookNumber, boolean isFree, int bookPrice, int bookPriceLate,
                       BookGenre bookGenre, LibrariesEnum librariesEnum) { //, List<Long> genreIds, List<Long> writerIds
        //List<Genre> genres = this.genreRepository.findAllById(genreIds);
        //List<Writer> writers = this.writerRepository.findAllById(writerIds);
        Book book = new Book(bookName, bookNumber, isFree, bookPrice, bookPriceLate, bookGenre, librariesEnum); //, genres, writers
        return this.bookRepository.save(book);
    }

    @Override
    public Book update(Long id, String bookName, int bookNumber, boolean isFree, int bookPrice, int bookPriceLate, List<Long> genreIds, List<Long> writerIds) {
        Book book =  this.findById(id);
        book.setBookName(bookName);
        book.setBookNumber(bookNumber);
        book.setFree(isFree);
        book.setBookPrice(bookPrice);
        book.setBookPriceLate(bookPriceLate);

        List<Genre> genres = this.genreRepository.findAllById(genreIds);
        List<Writer> writers = this.writerRepository.findAllById(genreIds);

        book.setGenre((Genre) genres);
        book.setWriters(writers);

        return this.bookRepository.save(book);
    }

    @Override
    public Book delete(Long id) {
        Book book =  this.findById(id);
        this.bookRepository.delete(book);
        return book;
    }


    //in bookRepository
    //TODO: listBooksByName, listBooksByNameAndGenre, listBooksByNameAndGenreAndWriter, listBooksByNameAndWriter
    //TODO: listBooksByGenre, listBooksByWriter
}
