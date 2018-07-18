package com.briup.app04.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app04.bean.Question;
import com.briup.app04.dao.QuestionMapper;
import com.briup.app04.dao.extend.QuestionVMMapper;
import com.briup.app04.service.IQuestionService;
import com.briup.app04.vm.QuestionVM;
@Service
public class QuestionServiceImpl implements IQuestionService{
	@Autowired
	private QuestionMapper questionMapper;
	@Autowired
	private QuestionVMMapper questionVMMapper;

	@Override
	public List<Question> findAllQuestion() throws Exception {
		return questionMapper.findAllQuestion();
	}
	

	@Override
	public List<QuestionVM> findAllQuestionVM() throws Exception {
		return questionVMMapper.findAllQuestionVM();
	}
	
	@Override
	public Question findById(Long id) throws Exception {
		//调用studentMapper查询所有学生
		
		return questionVMMapper.findById(id);
	}
	
	@Override
	public void deleteById(Long id) throws Exception {
		//1. 通过id查找
				Question question = questionVMMapper.findById(id);
				//2. 如果该学生存在，执行删除操作，如果该学生不存在，抛出异常
				if(question!=null){
					questionVMMapper.deleteById(id);
				} else {
					throw new Exception("要删除的问题不存在");
				}
				
	}
	@Override
	public void save(Question question) throws Exception{
		//调用
		 questionVMMapper.save(question);
	}
	
	@Override
	public void update(Question question) throws Exception{
		//调用
		
		 questionVMMapper.update(question);

	}
	
	
	
	
	
}
