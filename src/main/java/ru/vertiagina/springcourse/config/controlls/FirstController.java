package ru.vertiagina.springcourse.config.controlls;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * Author irkin
 **/
@RequestMapping("/")
@Controller
public class FirstController {


    //create request object
    @GetMapping("")
    public String greeting(HttpServletRequest request){
        System.out.println( request.getParameter("name") );

        return "first/hello";
    }



    //instead of creating request object, use @requestparam annotation
    //for ONLY retrieving parameters
    @GetMapping("bye")
    public String bye(@RequestParam(value = "name", required = false) String name)
    {
        System.out.println(name);
        return "first/goodbye";
    }


    @GetMapping("calculate")
    public String calculate(@RequestParam int a, @RequestParam int b, Model model)
    {
        int result = a +b;
     String s = Integer.toString(result);
        model.addAttribute("result",s);
       // System.out.println(result);
        return "first/result";
    }

}
