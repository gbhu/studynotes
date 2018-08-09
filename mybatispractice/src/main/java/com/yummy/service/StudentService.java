package com.yummy.service;

import com.yummy.model.Student;

import java.util.List;

/**
 * Created by yummy on 2017/9/22.
 */
public interface StudentService {
    public Student findById(String Id);
    public List<Student> getStudentInfo(String id);

}
