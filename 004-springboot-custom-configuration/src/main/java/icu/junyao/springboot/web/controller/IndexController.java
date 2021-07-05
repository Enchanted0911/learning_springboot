package icu.junyao.springboot.web.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author wu
 */
@Controller
public class IndexController {
    @Value("${school.name}")
    private String schoolName;
    @Value("${school.address}")
    private String schoolAddress;
    @RequestMapping("/say")
    @ResponseBody
    public Object say(String message) {
        return "say : helloMultiEnvironment" + message + " " + schoolName + " " + schoolAddress;
    }
}
