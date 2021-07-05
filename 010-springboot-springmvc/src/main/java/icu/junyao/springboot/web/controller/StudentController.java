package icu.junyao.springboot.web.controller;

import icu.junyao.springboot.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wu
 * RestController 相当于Controller 加上 ResponseBody 意味着当前控制层中类的方法返回的都是JSON对象
 * GetMapping 只能允许get请求访问 通常在查询数据的时候使用 相对应的还有
 * PostMapping 通常在新增数据的时候使用
 * DeleteMapping 通常在删除数据的时候使用
 * PutMapping 通常在修改数据的时候使用
 */
@RestController
public class StudentController {
    @RequestMapping("/student")
    //@ResponseBody
    public Object student() {
        Student student = new Student();
        student.setId(111);
        student.setAge(18);
        student.setName("vanessa");
        return student;
    }

    /**
     * 只能使用get请求访问
     * @return 返回某个学生对象
     */
    //@RequestMapping(value = "/student2", method = RequestMethod.GET)
    @GetMapping("/student2")
    public Object student2() {
        Student student = new Student();
        student.setId(222);
        student.setAge(28);
        student.setName("charlotte");
        return student;
    }
}
