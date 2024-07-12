package pl.eshoping.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/shop")
    public String executeScript() {
        return "index";
    }
}
