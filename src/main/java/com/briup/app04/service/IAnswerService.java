package com.briup.app04.service;

import java.util.List;

import com.briup.app04.bean.Answer;

public interface IAnswerService {
	List<Answer> findAll() throws Exception;
	
	Answer findById(Long id) throws Exception;
	void deleteById(Long id) throws Exception;
	void save(Answer answer) throws Exception;
	void update(Answer answer) throws Exception;
}
