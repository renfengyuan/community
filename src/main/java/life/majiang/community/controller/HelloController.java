package life.majiang.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/sayHi")
    public String sayHi(@RequestParam(name = "name",required = false) String name, Model model){
        model.addAttribute("name",name);
        return "hello";
    }
}
