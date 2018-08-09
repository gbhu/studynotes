package com.yummy.service.imp;

import com.yummy.dao.StudentMapper;
import com.yummy.model.Student;
import com.yummy.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by yummy on 2017/9/22.
 */
@Service("studentService")
public class StudentServiceImp implements StudentService {

    @Resource
    StudentMapper studentMapper;

    public Student findById(String Id) {
        return studentMapper.findById(Id);
    }

    public List<Student> getStudentInfo(String id) {
        return studentMapper.getStudentInfo(id);
    }
}
