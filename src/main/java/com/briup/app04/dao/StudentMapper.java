package com.briup.app04.dao;

import java.util.List;

import com.briup.app04.bean.Student;

public interface StudentMapper {
	
	List<Student> findAll();
	
	Student findById(Long id);
	Student deleteById(Long id);
	void save(Student student);
	void update(Student student);
}
