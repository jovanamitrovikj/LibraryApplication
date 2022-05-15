package mk.ukim.finki.db.library.web;

import mk.ukim.finki.db.library.model.exception.InvalidArgumentsException;
import mk.ukim.finki.db.library.model.exception.PasswordsDoNotMatchException;
import mk.ukim.finki.db.library.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

@Controller
@RequestMapping("/register")
public class RegisterController {

    private final UserService userService;

    public RegisterController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String getRegisterPage(@RequestParam(required = false) String error, Model model) {
        if(error != null && !error.isEmpty()) {
            model.addAttribute("hasError", true);
            model.addAttribute("error", error);
        }
        return "register";
    }

    @PostMapping
    public String register(@RequestParam String name,
                           @RequestParam String surname,
                           @RequestParam Date birthDate,
                           @RequestParam String town,
                           @RequestParam String address,
                           @RequestParam String phoneNumber,
                           @RequestParam String email,
                           @RequestParam String password
                           ) {
        try{
            this.userService.register(name, surname, birthDate, town, address, phoneNumber, email, password);
            return "redirect:/login";
        } catch (InvalidArgumentsException | PasswordsDoNotMatchException exception) {
            return "redirect:/register?error=" + exception.getMessage();
        }
    }
//                           @RequestParam SchoolType schoolType,
//                           @RequestParam MembershipType membershipType,

}

