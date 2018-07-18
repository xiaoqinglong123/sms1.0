package com.briup.app04.service;

import java.util.List;

import com.briup.app04.bean.Student;

public interface IStudentService {
	List<Student> findAll() throws Exception;
	
	Student findById(Long id) throws Exception;
	void deleteById(Long id) throws Exception;
	void save(Student student) throws Exception;
	void update(Student student) throws Exception;
}
