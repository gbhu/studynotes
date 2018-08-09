package com.yummy.dao;

import java.util.List;

import com.yummy.model.Student;

public interface StudentMapper {
	public Student findById(String Id);
	public List<Student> getStudentInfo(String id);
}
