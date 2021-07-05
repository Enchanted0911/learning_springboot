package icu.junyao.springboot.webcontroller;

import icu.junyao.springboot.service.StudentService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author wu
 */
@RestController
public class StudentController {
    @DubboReference(interfaceClass = StudentService.class, version = "1.0-SNAPSHOT", check = false)
    private StudentService studentService;

    @RequestMapping("/student/count")
    public int student() {
        return studentService.queryAllStudentCount();
    }

}
