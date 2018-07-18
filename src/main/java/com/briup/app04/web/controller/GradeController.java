package com.briup.app04.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app04.bean.Grade;
import com.briup.app04.service.IGradeService;
import com.briup.app04.util.MsgResponse;

@RestController
@RequestMapping("/grade")
public class GradeController {
	//注入studentService的实例
	@Autowired
	private IGradeService gradeService;
	
	//http://127.0.0.1:8080/student/findAllStudent
	@GetMapping("findAllGrade")
	public List<Grade> findAllGrade(){
		
		try {
			List<Grade> list = gradeService.findAll();
			return list;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	@GetMapping("findGradeById")
	public Grade findGradeById(Long id){
		try {
			Grade grade = gradeService.findById(id);
			return grade;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@GetMapping("deleteGradeById")
	public MsgResponse deleteById(Long id){
		try {
			gradeService.deleteById(id);
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
	@PostMapping("saveGrdae")
	public String saveGrade(Grade grade){
		try {
			gradeService.save(grade);
			return "保存成功";
		} catch (Exception e) {
			e.printStackTrace();
			return "失败";
		}
	}
	@PostMapping("update")
	public String updateGrade(Grade grade){
		try {
			gradeService.update(grade);
			return "修改成功";
		} catch (Exception e) {
			e.printStackTrace();
			return "失败";
		}
	}
	
}

