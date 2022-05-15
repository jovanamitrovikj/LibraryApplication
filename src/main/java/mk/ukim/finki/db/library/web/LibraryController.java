package mk.ukim.finki.db.library.web;

import mk.ukim.finki.db.library.model.Library;
import mk.ukim.finki.db.library.service.BookService;
import mk.ukim.finki.db.library.service.LibraryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/library")
public class LibraryController {

    private final LibraryService libraryService;

    public LibraryController(LibraryService libraryService) {
        this.libraryService = libraryService;
    }

    @GetMapping("/library/{id}")
    public String getLibraryPage(@PathVariable Long id, @RequestParam(required = false) String error, Model model){
        if (error != null && !error.isEmpty()) {
            model.addAttribute("hasError", true);
            model.addAttribute("error", error);
        }

        Library library = this.libraryService.findById(id);
        model.addAttribute("library", library);

        return "redirect:/home";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable Long id) {
        this.libraryService.delete(id);
        return "redirect:/library";
    }
}
