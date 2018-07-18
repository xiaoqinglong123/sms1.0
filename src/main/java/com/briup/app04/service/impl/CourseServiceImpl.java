package com.briup.app04.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app04.bean.Course;
import com.briup.app04.dao.CourseMapper;
import com.briup.app04.service.ICourseService;
@Service
public class CourseServiceImpl implements ICourseService {
	@Autowired
	private CourseMapper courseMapper;
	
	@Override
	public List<Course> findAll() throws Exception {
		//调用studentMapper查询所有学生
		List<Course> list = courseMapper.findAll();
		return list;
	}
	
	@Override
	public Course findById(Long id) throws Exception {
		//调用studentMapper查询所有学生
		
		return courseMapper.findById(id);
	}
	
	@Override
	public void deleteById(Long id) throws Exception {
		//1. 通过id查找
				Course student = courseMapper.findById(id);
				//2. 如果该学生存在，执行删除操作，如果该学生不存在，抛出异常
				if(student!=null){
					courseMapper.deleteById(id);
				} else {
					throw new Exception("要删除的课程不存在");
				}
				
	}
	@Override
	public void save(Course course) throws Exception{
		//调用
		 courseMapper.save(course);
	}
	
	@Override
	public void update(Course course) throws Exception{
		//调用
		
		 courseMapper.update(course);
	}
}