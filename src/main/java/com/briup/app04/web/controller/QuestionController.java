package com.briup.app04.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app04.bean.Question;
import com.briup.app04.service.IQuestionService;
import com.briup.app04.util.MsgResponse;
import com.briup.app04.vm.QuestionVM;

@RestController
@RequestMapping("/question")
public class QuestionController {
	//注入studentService的实例
	@Autowired
	private IQuestionService questionService;
	
	//http://127.0.0.1:8080/student/findAllStudent
	@GetMapping("findAllQuestionVM")
	public List<QuestionVM> findAllQuestionVM(){
		
		try {
			List<QuestionVM> list = questionService.findAllQuestionVM();
			return list;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	@GetMapping("findAllQuestion")
	public List<Question> findAllQuestion(){
		
		try {
			List<Question> list = questionService.findAllQuestion();
			return list;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	@GetMapping("findQuestionById")
	public Question findQuestionById(Long id){
		try {
			Question question = questionService.findById(id);
			return question;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@GetMapping("deleteQuestionById")
	public MsgResponse deleteById(Long id){
		try {
			questionService.deleteById(id);
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
	@PostMapping("saveQuestion")
	public String saveQuestion(Question question){
		try {
			questionService.save(question);
			return "保存成功";
		} catch (Exception e) {
			e.printStackTrace();
			return "失败";
		}
	}
	@PostMapping("updateQuestion")
	public String updateQuestion(Question question){
		try {
			questionService.update(question);
			return "修改成功";
		} catch (Exception e) {
			e.printStackTrace();
			return "失败";
		}
	}
	
}
