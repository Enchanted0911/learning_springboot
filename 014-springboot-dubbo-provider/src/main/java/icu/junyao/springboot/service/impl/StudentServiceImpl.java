package icu.junyao.springboot.service.impl;

import icu.junyao.springboot.service.StudentService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;

/**
 * @author wu
 */
@Component
@DubboService(interfaceClass = StudentService.class, version = "1.0-SNAPSHOT", timeout = 15000)
public class StudentServiceImpl implements StudentService {
    @Override
    public int queryAllStudentCount() {
        return 1998;
    }
}
