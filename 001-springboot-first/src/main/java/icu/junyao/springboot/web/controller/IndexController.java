package icu.junyao.springboot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author wu
 */
@Controller
public class IndexController {
    @RequestMapping("/springboot.do")
    @ResponseBody
    public String doSome() {
        return "hello";
    }
}
