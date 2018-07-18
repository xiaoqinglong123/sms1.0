package com.briup.app04.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app04.bean.Questionnaire;
import com.briup.app04.service.IQuestionnaireService;
import com.briup.app04.util.MsgResponse;

@RestController
@RequestMapping("/questionnaire")
public class QuestionnaireController {
	//注入studentService的实例
	@Autowired
	private IQuestionnaireService questionnaireService;
	
	//http://127.0.0.1:8080/student/findAllStudent
	@GetMapping("findAllQuestionnaire")
	public List<Questionnaire> findAllQuestionnaire(){
		
		try {
			List<Questionnaire> list = questionnaireService.findAll();
			return list;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	@GetMapping("findQuestionnaireById")
	public Questionnaire findQuestionnaireById(Long id){
		try {
			Questionnaire questionnaire = questionnaireService.findById(id);
			return questionnaire;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@GetMapping("deleteQuestionnaireById")
	public MsgResponse deleteById(Long id){
		try {
			questionnaireService.deleteById(id);
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
	@PostMapping("saveQuestionnaire")
	public String saveQuestionnaire(Questionnaire questionnaire){
		try {
			questionnaireService.save(questionnaire);
			return "保存成功";
		} catch (Exception e) {
			e.printStackTrace();
			return "失败";
		}
	}
	@PostMapping("updateQuestionnaire")
	public String updateQuestionaire(Questionnaire questionnaire){
		try {
			questionnaireService.update(questionnaire);
			return "修改成功";
		} catch (Exception e) {
			e.printStackTrace();
			return "失败";
		}
	}
	
}
