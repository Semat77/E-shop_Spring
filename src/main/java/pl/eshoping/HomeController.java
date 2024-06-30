package pl.eshoping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping(path="/hello", produces="text/plain")
    @ResponseBody
    public String hello() {
        return "Hello world";
    }

    @GetMapping("/skrypt")
    public String wykonajSkrypt() {
        return "wykonaj_skrypt";
    }

}
