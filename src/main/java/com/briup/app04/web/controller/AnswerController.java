package com.briup.app04.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app04.bean.Answer;
import com.briup.app04.service.IAnswerService;
import com.briup.app04.util.MsgResponse;

@RestController
@RequestMapping("/student")
public class AnswerController {
	//注入studentService的实例
	@Autowired
	private IAnswerService answerService;
	
	//http://127.0.0.1:8080/student/findAllStudent
	@GetMapping("findAllAnswer")
	public List<Answer> findAllAnswer(){
		
		try {
			List<Answer> list = answerService.findAll();
			return list;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	@GetMapping("findAnswerById")
	public Answer findAnswerById(Long id){
		try {
			Answer answer = answerService.findById(id);
			return answer;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@GetMapping("deleteAnswerById")
	public MsgResponse deleteById(Long id){
		try {
			answerService.deleteById(id);
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
	@PostMapping("saveAnswer")
	public String saveAnswer(Answer answer){
		try {
			answerService.save(answer);
			return "保存成功";
		} catch (Exception e) {
			e.printStackTrace();
			return "失败";
		}
	}
	@PostMapping("updateAnswer")
	public String updateAnswer(Answer answer){
		try {
			answerService.update(answer);
			return "修改成功";
		} catch (Exception e) {
			e.printStackTrace();
			return "失败";
		}
	}
	
}
