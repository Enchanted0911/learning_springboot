package icu.junyao.springboot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wu
 */
@Controller
public class UserController {

    @RequestMapping("/user/detail")
    @ResponseBody
    public Object userDetail() {
        Map<String, Object> retMap = new HashMap<>(8);
        retMap.put("id", 1001);
        retMap.put("userName", "vanessa");
        return retMap;
    }

    @RequestMapping("/user/detail2")
    public String goUserDetail(Model model) {
        model.addAttribute("id", 1001);
        model.addAttribute("userName", "vanessa");
        return "userDetail";
    }
}
