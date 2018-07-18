package com.briup.app04.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app04.bean.Questionnaire;
import com.briup.app04.dao.QuestionnaireMapper;
import com.briup.app04.service.IQuestionnaireService;
@Service
public class QuestionnaireServiceImpl implements IQuestionnaireService{
	
	@Autowired
	private QuestionnaireMapper questionnaireMapper;
	
	@Override
	public List<Questionnaire> findAll() throws Exception {
		//调用studentMapper查询所有学生
		List<Questionnaire> list = questionnaireMapper.findAll();
		return list;
	}
	
	@Override
	public Questionnaire findById(Long id) throws Exception {
		//调用studentMapper查询所有学生
		
		return questionnaireMapper.findById(id);
	}
	
	@Override
	public void deleteById(Long id) throws Exception {
		//1. 通过id查找
				Questionnaire questionnaire = questionnaireMapper.findById(id);
				//2. 如果该学生存在，执行删除操作，如果该学生不存在，抛出异常
				if(questionnaire!=null){
					questionnaireMapper.deleteById(id);
				} else {
					throw new Exception("要删除的问卷不存在");
				}
				
	}
	@Override
	public void save(Questionnaire questionnaire) throws Exception{
		//调用
		 questionnaireMapper.save(questionnaire);
	}
	
	@Override
	public void update(Questionnaire questionnaire) throws Exception{
		//调用
		
		 questionnaireMapper.update(questionnaire);

	}
	
	
}

