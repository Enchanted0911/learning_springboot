package icu.junyao.springboot.web.controller;

import icu.junyao.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author wu
 */
@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/student")
    @ResponseBody
    public Object student(Integer id) {
        return studentService.queryStudentById(id);
    }
}
