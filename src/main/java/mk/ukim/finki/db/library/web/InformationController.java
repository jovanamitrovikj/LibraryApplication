package mk.ukim.finki.db.library.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InformationController {

    @GetMapping("/info")
    public String getInfo(){
        return "info";
    }
}
