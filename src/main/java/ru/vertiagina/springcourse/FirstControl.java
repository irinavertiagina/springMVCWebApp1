package ru.vertiagina.springcourse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Author irkin
 **/
@Controller
public class FirstControl {


    @GetMapping("/hello")//url
    public String hello(){
        return "say_hello";
    }
}
