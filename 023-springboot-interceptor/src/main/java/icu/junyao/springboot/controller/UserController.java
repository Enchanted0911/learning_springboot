package icu.junyao.springboot.controller;

import icu.junyao.springboot.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author wu
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/login")
    public Object login(HttpServletRequest request) {
        User user = new User();
        user.setUserName("vanessa");
        user.setId(11);
        request.getSession().setAttribute("user", user);
        return "login Success";
    }

    @RequestMapping("/center")
    public String center() {
        return "see Center Message";
    }

    @RequestMapping("/out")
    public String out() {
        return "see out Message";
    }
    @RequestMapping("/error")
    public String error() {
        return "see error Message";
    }

}
