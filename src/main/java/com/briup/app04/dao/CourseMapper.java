package com.briup.app04.dao;

import java.util.List;

import com.briup.app04.bean.Course;

public interface CourseMapper {
	List<Course> findAll();
	
	Course findById(Long id);
	Course deleteById(Long id);
	void save(Course answer);
	void update(Course answer);
}
