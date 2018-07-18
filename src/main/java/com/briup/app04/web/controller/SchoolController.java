package com.briup.app04.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app04.bean.School;
import com.briup.app04.service.ISchoolService;
import com.briup.app04.util.MsgResponse;

@RestController
@RequestMapping("/school")
public class SchoolController {
	//注入studentService的实例
	@Autowired
	private ISchoolService schoolService;
	
	//http://127.0.0.1:8080/student/findAllStudent
	@GetMapping("findAllSchool")
	public List<School> findAllSchool(){
		
		try {
			List<School> list = schoolService.findAll();
			return list;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	@GetMapping("findSchoolById")
	public School findSchoolById(Long id){
		try {
			School school = schoolService.findById(id);
			return school;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@GetMapping("deleteSchoolById")
	public MsgResponse deleteById(Long id){
		try {
			schoolService.deleteById(id);
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
	@PostMapping("saveSchool")
	public String saveSchool(School school){
		try {
			schoolService.save(school);
			return "保存成功";
		} catch (Exception e) {
			e.printStackTrace();
			return "失败";
		}
	}
	@PostMapping("updateSchool")
	public String updateSchool(School school){
		try {
			schoolService.update(school);
			return "修改成功";
		} catch (Exception e) {
			e.printStackTrace();
			return "失败";
		}
	}
	
}

