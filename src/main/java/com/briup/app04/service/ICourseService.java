package com.briup.app04.service;

import java.util.List;

import com.briup.app04.bean.Course;

public interface ICourseService {
	List<Course> findAll() throws Exception;
	
	Course findById(long course_id) throws Exception;
	void deleteById(long course_id) throws Exception;
	void save(Course course) throws Exception;
	void update(Course course) throws Exception;
}
