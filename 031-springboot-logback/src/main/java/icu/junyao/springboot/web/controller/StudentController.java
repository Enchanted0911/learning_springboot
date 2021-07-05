package icu.junyao.springboot.web.controller;

import icu.junyao.springboot.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author wu
 */
@Controller
@Slf4j
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/student")
    @ResponseBody
    public Object student(Integer id) {
        return studentService.queryStudentById(id);
    }

    @GetMapping("/student/all")
    @ResponseBody
    public Object allStudentNum() {
        log.info("111111");
        Integer cnt = studentService.queryAllStudentCnt();
        return "学生总人数为" + cnt;
    }
}
