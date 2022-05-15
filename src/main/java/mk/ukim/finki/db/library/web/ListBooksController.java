package mk.ukim.finki.db.library.web;

import mk.ukim.finki.db.library.model.Book;
import mk.ukim.finki.db.library.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ListBooksController {

    private final BookService bookService;

    public ListBooksController(BookService bookService) {
        this.bookService = bookService;
    }


    @GetMapping("/listBooks")
    public String listbooks(Model model){
        List<Book> bookList = this.bookService.listAllBooks();
        model.addAttribute("bookList", bookList);
        return "listBooks";
    }
}
