package icu.junyao.springboot.web.controller;

import icu.junyao.springboot.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
 * @author wu
 */
@Controller
public class UserController {

    @RequestMapping("/url")
    public String urlExpression(Model model) {
        model.addAttribute("id", 112311);
        model.addAttribute("userName", "vanessa");
        return "url";
    }

    @RequestMapping("/thymeleaf")
    public String goUserDetail(Model model) {
        User user = new User();
        user.setId(1001);
        user.setUserName("vanessa");
        user.setAge(18);
        model.addAttribute("user", user);
        return "userDetail";
    }

    @RequestMapping("/test")
    @ResponseBody
    public String urlExpression(String userName) {
        return "url" + userName;
    }

    @RequestMapping("/test1")
    @ResponseBody
    public String urlExpression1(String userName, Integer id) {
        return "url" + userName + id;
    }

    @RequestMapping("/test2/{id}")
    @ResponseBody
    public String urlExpression2(@PathVariable Integer id) {
        return "url" + id;
    }

    @RequestMapping("/url2")
    public String url2() {
        return "url2";
    }

    @RequestMapping("/property")
    public String property() {
        return "property";
    }

    // ---------------------------------------------------循环
    @RequestMapping("/each/list")
    public String eachList(Model model) {
        List<User> userList = new ArrayList<User>();

        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setId(100 + i);
            user.setNick("张" + i);
            user.setPhone("1361234567" + i);
            user.setAddress("北京市大兴区" + i);
            userList.add(user);
        }
        model.addAttribute("userList", userList);
        model.addAttribute("data", "SpringBoot");
        return "eachList";
    }

    @RequestMapping(value = "/each/map")
    public String eachMap(Model model) {
        Map<Integer, Object> userMaps = new HashMap<Integer, Object>();

        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setId(i);
            user.setNick("李四" + i);
            user.setPhone("1390000000" + i);
            user.setAddress("天津市" + i);
            userMaps.put(i, user);
        }
        model.addAttribute("userMaps", userMaps);
        return "eachMap";
    }

    @RequestMapping(value = "/each/array")
    public String eachArray(Model model) {

        User[] userArray = new User[10];

        for (int i = 0; i < 10; i++) {

            User user = new User();
            user.setId(i);
            user.setNick("赵六" + i);
            user.setPhone("1380000000" + i);
            user.setAddress("深圳市" + i);
            userArray[i] = user;

        }
        model.addAttribute("userArray", userArray);
        return "eachArray";
    }

    @RequestMapping(value = "/each/all")
    public String eachAll(Model model) {
        //list -> Map -> List -> User
        List<Map<Integer, List<User>>> myList = new ArrayList<Map<Integer, List<User>>>();

        for (int i = 0; i < 2; i++) {

            Map<Integer, List<User>> myMap = new HashMap<Integer, List<User>>();
            for (int j = 0; j < 2; j++) {
                List<User> myUserList = new ArrayList<User>();
                for (int k = 0; k < 3; k++) {
                    User user = new User();
                    user.setId(k);
                    user.setNick("张三" + k);
                    user.setPhone("1350000000" + k);
                    user.setAddress("广州市" + i);
                    myUserList.add(user);
                }
                myMap.put(j, myUserList);
            }
            myList.add(myMap);

        }
        model.addAttribute("myList", myList);
        return "eachAll";
    }

    // -----------------------------------------------条件判断
    @RequestMapping("/condition")
    public String condition(Model model) {
        model.addAttribute("gender", 1);
        model.addAttribute("flag", true);
        model.addAttribute("product", 5);
        return "condition";
    }

    //----------------------------------inline
    @RequestMapping("/inline")
    public String inline(Model model) {
        model.addAttribute("data", "springboot inline");
        return "inline";
    }

    //--------------------------------------字面量
    @RequestMapping("/literal")
    public String literal(Model model) {
        model.addAttribute("gender", 1);
        model.addAttribute("data", "springboot data");
        model.addAttribute("flag", true);
        User user = new User();
        user.setId(1001);
        user.setUserName("vanessa");
        model.addAttribute("user", user);

        User userDetail = new User();
        model.addAttribute("userDetail", userDetail);
        return "literal";
    }

    //-------------------------------------字符串拼接
    @RequestMapping(value = "/splice")
    public String splice(Model model) {
        model.addAttribute("totalRows", 123);
        model.addAttribute("totalPage", 13);
        model.addAttribute("currentPage", 2);

        return "splice";
    }

    //--------------------------------------运算符
    @RequestMapping(value = "/operator")
    public String operator(Model model) {
        model.addAttribute("sex", 1);
        model.addAttribute("flag", true);
        return "operator";
    }

    //--------------------------------基本表达式对象
    @RequestMapping(value = "/index")
    public String index(HttpServletRequest request, Model model, Integer id) {
        model.addAttribute("username", "vanessa");

        request.getSession().setAttribute("data", "sessionData");

        return "index";
    }

    //------------------------------------功能表达式对象
    @RequestMapping(value = "/function")
    public String function(Model model) {
        model.addAttribute("time",new Date());
        model.addAttribute("data","SpringBootHelloWorld");
        return "function";
    }
}
