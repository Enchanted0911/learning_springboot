package icu.junyao.springboot.web.controller;

import icu.junyao.springboot.config.Abc;
import icu.junyao.springboot.config.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author wu
 */
@Controller
public class IndexController {
    @Autowired
    private School school;
    @Autowired
    private Abc abc;
    @RequestMapping("/say")
    @ResponseBody
    public Object say() {
        return "say : helloMultiEnvironment" + school.getName() + " " + abc.getAddress();
    }
}
