package icu.junyao.springboot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @author wu
 */
@Controller
public class IndexController {
    @RequestMapping("/say")
    public String say(Model model) {
        model.addAttribute("name", "vanessa");
        return "hello";
    }
}
