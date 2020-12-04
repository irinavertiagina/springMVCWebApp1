package ru.vertiagina.springcourse.config.controlls;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Author irkin
 **/
@Controller
public class SecondController {


    @GetMapping("/away")
public String away(){
    return "second/exit";
}

}
