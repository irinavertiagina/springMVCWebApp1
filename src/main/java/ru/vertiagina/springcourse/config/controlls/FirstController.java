package ru.vertiagina.springcourse.config.controlls;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author irkin
 **/
@RequestMapping("/")
@Controller
public class FirstController {

    @GetMapping("")
    public String greeting(){
        return "first/hello";
    }

    @GetMapping("bye")
    public String bye(){
        return "first/goodbye";
    }

}
