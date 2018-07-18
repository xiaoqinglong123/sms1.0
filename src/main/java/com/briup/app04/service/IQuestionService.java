package com.briup.app04.service;

import java.util.List;

import com.briup.app04.bean.Question;
import com.briup.app04.vm.QuestionVM;

public interface IQuestionService {
	List<Question> findAllQuestion() throws Exception;
	List<QuestionVM> findAllQuestionVM() throws Exception;
	
	Question findById(Long id) throws Exception;
	void deleteById(Long id) throws Exception;
	void save(Question question) throws Exception;
	void update(Question question) throws Exception;

	
	
}
