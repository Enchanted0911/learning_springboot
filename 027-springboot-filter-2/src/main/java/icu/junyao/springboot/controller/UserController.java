package icu.junyao.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wu
 */
@RestController
public class UserController {
    @RequestMapping("/user/detail")
    public String userDetail() {
        return "111111";
    }

    @RequestMapping("/user/detail/1")
    public String userDetail1() {
        return "111111fffff";
    }

    @RequestMapping("/center")
    public String center() {
        return "2222";
    }
}
