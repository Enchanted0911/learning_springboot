package icu.junyao.springboot.web.controller;

import icu.junyao.springboot.service.StudentService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.net.Inet4Address;


/**
 * @author wu
 */
@Controller
public class StudentController {
    @DubboReference(interfaceClass = StudentService.class, version = "1.0.0", check = false)
    private StudentService studentService;

    @RequestMapping("/student/detail/{id}")
    public String studentDetail(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("student", studentService.selectByPrimaryKey(id));
        return "studentDetail";
    }

    @GetMapping("/student/all")
    @ResponseBody
    public Object allStudentNum() {
        Integer cnt = studentService.queryAllStudentCnt();
        return "学生总人数为" + cnt;
    }

}
