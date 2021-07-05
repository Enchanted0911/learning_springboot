package icu.junyao.springboot.service.impl;

import icu.junyao.springboot.mapper.StudentMapper;
import icu.junyao.springboot.model.Student;
import icu.junyao.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author wu
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public Object queryStudentById(Integer id) {
        return studentMapper.selectByPrimaryKey(id);
    }

    @Override
    @Transactional
    public int updateStudentById(Student student) {
        return studentMapper.updateByPrimaryKeySelective(student);
    }
}
