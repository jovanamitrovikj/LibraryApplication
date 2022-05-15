package mk.ukim.finki.db.library;

import mk.ukim.finki.db.library.model.Book;
import mk.ukim.finki.db.library.model.Library;
import mk.ukim.finki.db.library.model.Person;
import mk.ukim.finki.db.library.model.Writer;
import mk.ukim.finki.db.library.repository.BookRepository;
import mk.ukim.finki.db.library.repository.LibraryRepository;
import mk.ukim.finki.db.library.repository.WriterRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@ComponentScan(basePackages = {"mk.ukim.finki.db.library.repository"})
public class LibraryApplication {

    public static void main(String[] args) {
        //ConfigurableApplicationContext configurableApplicationContext =
        SpringApplication.run(LibraryApplication.class, args);

        // Writer
//        WriterRepository writerRepository =
//                configurableApplicationContext.getBean(WriterRepository.class);
//
//        Writer writer = new Writer("Dan Brown");
//        writerRepository.save(writer);

        // Library
//        LibraryRepository libraryRepository =
//                configurableApplicationContext.getBean(LibraryRepository.class);
//
//        Library library = new Library("Brakja Miladinovci", "Skopje");
//        libraryRepository.save(library);

        // Book
//        BookRepository bookRepository =
//                configurableApplicationContext.getBean(BookRepository.class);
//
//        Book book = new Book("Inferno", 10, true, 30, 50, library);
//        bookRepository.save(book);
    }
}
