package icu.junyao.springboot.service;

import icu.junyao.springboot.model.Student;

/**
 * @author wu
 */
public interface StudentService {
    /**
     * 返回查询的学生
     * @param id 学生id
     * @return 返回学生
     */
    Student selectByPrimaryKey(Integer id);

    /**
     * 获取学生总人数
     * @return 返回学生总人数
     */
    Integer queryAllStudentCnt();
}
