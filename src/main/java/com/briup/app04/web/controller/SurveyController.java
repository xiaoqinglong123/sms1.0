package com.briup.app04.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app04.bean.Survey;
import com.briup.app04.service.ISurveyService;
import com.briup.app04.util.MsgResponse;

@RestController
@RequestMapping("/survey")
public class SurveyController {
	//注入studentService的实例
	@Autowired
	private ISurveyService surveyService;
	
	//http://127.0.0.1:8080/student/findAllStudent
	@GetMapping("findAllSurvey")
	public List<Survey> findAllSurvey(){
		
		try {
			List<Survey> list = surveyService.findAll();
			return list;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	@GetMapping("findSurveyById")
	public Survey findSurveyById(Long id){
		try {
			Survey survey = surveyService.findById(id);
			return survey;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@GetMapping("deleteSurveyById")
	public MsgResponse deleteById(Long id){
		try {
			surveyService.deleteById(id);
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
	@PostMapping("saveSurvey")
	public String saveSurvey(Survey survey){
		try {
			surveyService.save(survey);
			return "保存成功";
		} catch (Exception e) {
			e.printStackTrace();
			return "失败";
		}
	}
	@PostMapping("updateSurvey")
	public String updateSurvey(Survey survey){
		try {
			surveyService.update(survey);
			return "修改成功";
		} catch (Exception e) {
			e.printStackTrace();
			return "失败";
		}
	}
	
}

