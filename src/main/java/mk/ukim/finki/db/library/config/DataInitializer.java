package mk.ukim.finki.db.library.config;

import mk.ukim.finki.db.library.model.Book;
import mk.ukim.finki.db.library.model.Person;
import mk.ukim.finki.db.library.model.Writer;
import mk.ukim.finki.db.library.service.BookService;
import mk.ukim.finki.db.library.service.LibraryService;
import mk.ukim.finki.db.library.service.UserService;
import mk.ukim.finki.db.library.service.WriterService;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class DataInitializer {

    private final UserService userService;
    private final BookService bookService;
    private final WriterService writerService;

    public DataInitializer(UserService userService, BookService bookService, WriterService writerService, LibraryService libraryService) {
        this.userService = userService;
        this.bookService = bookService;
        this.writerService = writerService;
    }

    @PostConstruct
    public void initData(){
        Person member = this.userService.register("MemberName", "MemberSurname",
                "MemberAddres", "MemberTown", "071/111/222", "memberemail@hotmail.com", "baza123!");
//
        Writer writer = this.writerService.create("Dan Brown");
//
        Book book = this.bookService.create("Inferno", 10, true, 30, 50);


    }
}
