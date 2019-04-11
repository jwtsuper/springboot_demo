package com.baizhi.service.impl;

import com.baizhi.dao.StudentDao;
import com.baizhi.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements com.baizhi.service.impl.StudentService {
    @Autowired
    private StudentDao studentDao;

    @Override
    public List<Student> select() {
        return null;
    }
}
