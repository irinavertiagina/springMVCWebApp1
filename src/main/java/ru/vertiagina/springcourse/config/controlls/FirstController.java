package ru.vertiagina.springcourse.config.controlls;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Author irkin
 **/
@RequestMapping("/")
@Controller
public class FirstController {

    @GetMapping("")
    public String greeting(HttpServletRequest request){
        System.out.println( request.getParameter("name") );

        return "first/hello";
    }

    @GetMapping("bye")
    public String bye(){
        return "first/goodbye";
    }

}
