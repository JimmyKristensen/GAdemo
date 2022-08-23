package Controller;

import org.springframework.web.bind.annotation.GetMapping;

public class controller {

    @GetMapping("/")
    public String index(){
        return "index";
    }
}
