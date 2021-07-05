package icu.junyao.springboot.service.impl;

import icu.junyao.springboot.mapper.StudentMapper;
import icu.junyao.springboot.model.Student;
import icu.junyao.springboot.service.StudentService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * @author wu
 */
@Component
@DubboService(interfaceClass = StudentService.class, version = "1.0.0", timeout = 15000)
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private RedisTemplate<Object, Object> redisTemplate;
    @Override
    public Student selectByPrimaryKey(Integer id) {
        return studentMapper.selectByPrimaryKey(id);
    }

    @Override
    public Integer queryAllStudentCnt() {
        Integer cnt = (Integer) redisTemplate.opsForValue().get("totalNum");
        if (cnt == null) {
            cnt = studentMapper.selectAllStudentNum();
            redisTemplate.opsForValue().set("totalNum", cnt, 30, TimeUnit.MINUTES);
        }
        return cnt;
    }
}
