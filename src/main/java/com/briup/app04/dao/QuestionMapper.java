package com.briup.app04.dao;

import java.util.List;

import com.briup.app04.bean.Question;


public interface QuestionMapper {
	List<Question> findAllQuestion();
	
	Question findById(Long id);
	Question deleteById(Long id);
	void save(Question question);
	void update(Question question);
}
