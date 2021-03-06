package com.briup.app04.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app04.bean.Course;
import com.briup.app04.service.ICourseService;
import com.briup.app04.util.MsgResponse;

@RestController
@RequestMapping("/course")
public class CourseController {
	//注入studentService的实例
	@Autowired
	private ICourseService courseService;
	
	//http://127.0.0.1:8080/student/findAllStudent
	@GetMapping("findAllCourse")
	public List<Course> findAllCourse(){
		
		try {
			List<Course> list = courseService.findAll();
			return list;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	@GetMapping("findCourseById")
	public Course findCourseById(Long id){
		try {
			Course course = courseService.findById(id);
			return course;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@GetMapping("deleteCourseById")
	public MsgResponse deleteById(Long id){
		try {
			courseService.deleteById(id);
			return MsgResponse.success("删除成功", null);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	/**
	 * @author Administrator
	 * @param student
	 * @return
	 */
	@PostMapping("saveCourse")
	public String saveCourse(Course course){
		try {
			courseService.save(course);
			return "保存成功";
		} catch (Exception e) {
			e.printStackTrace();
			return "失败";
		}
	}
	@PostMapping("updateCourse")
	public String updateCourse(Course course){
		try {
			courseService.update(course);
			return "修改成功";
		} catch (Exception e) {
			e.printStackTrace();
			return "失败";
		}
	}
	
}

