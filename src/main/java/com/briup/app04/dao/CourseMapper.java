package com.briup.app04.dao;

import java.util.List;

import com.briup.app04.bean.Course;


public interface CourseMapper {
	List<Course> findAll();
	
	Course findById(long course_id);
	Course update(long course_id,String course_name,String description);
	Course deleteById(long course_id);
	void save(Course course);
	void update(Course course);
	
}

