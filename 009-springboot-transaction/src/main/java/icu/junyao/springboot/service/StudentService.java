package icu.junyao.springboot.service;

import icu.junyao.springboot.model.Student;

/**
 * @author wu
 */
public interface StudentService {
    /**
     * 根据学生id查询详情
     * @param id 学生id
     * @return 返回查询的学生
     */
    Object queryStudentById(Integer id);

    /**
     * 根据学生id修改学生姓名
     * @param student 学生
     * @return 修改成功的记录数
     */
    int updateStudentById(Student student);
}
