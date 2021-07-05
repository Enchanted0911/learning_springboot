package icu.junyao.springboot.web.controller;

import icu.junyao.springboot.model.Student;
import org.springframework.web.bind.annotation.*;

/**
 * @author wu
 */
@RestController
public class StudentController {

    /**
     * 普通http风格
     * @param student
     * @return
     */
    @RequestMapping("/student")
    public Student student(Student student) {
        return student;
    }

    /**
     * 普RESTful风格
     * 当请求摸棱两可时用四种不同的mapping来区分请求 还有 更换路径位置的方式解决冲突
     * RESTful风格要求请求路径中的单词都是名词最好不要出现动词
     * 一般传的参数不是数据库表中的字段 不要使用斜杠 (使用原始http请求)
     */
    @GetMapping("/student/{id}/detail/{age}")
    public Student student1(@PathVariable("id") Integer id, @PathVariable("age") Integer age) {
        Student student = new Student();
        student.setAge(age);
        student.setName("junyao");
        student.setId(id);
        return student;
    }
    @GetMapping("/student/detail/{id}/{age}")
    public Student student2(@PathVariable("id") Integer id, @PathVariable("age") Integer age) {
        Student student = new Student();
        student.setAge(age);
        student.setId(id);
        return student;
    }

    @DeleteMapping("/student/detail/{id}/{name}")
    public Student student3(@PathVariable("id") Integer id, @PathVariable("name") String name) {
        Student student = new Student();
        student.setName(name);
        student.setId(id);
        student.setAge(100000);
        return student;
    }
}
