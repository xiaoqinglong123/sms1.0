package com.briup.app04.dao;

import java.util.List;

import com.briup.app04.bean.Answer;

public interface AnswerMapper {
	List<Answer> findAll();
	
	Answer findById(long id);
	Answer deleteById(long id);
	void save(Answer answer);
	void update(Answer answer);
}
