package icu.junyao.springboot.service.impl;

import icu.junyao.springboot.service.StudentService;
import org.springframework.stereotype.Service;

/**
 * @author wu
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Override
    public String sayHello() {
        return "hello springboot";
    }
}
