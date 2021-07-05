package icu.junyao.springboot.service;

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
     * 获取学生总人数
     * @return 返回学生总人数
     */
    Integer queryAllStudentCnt();
}
