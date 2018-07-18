package com.briup.app04.service;

import java.util.List;

import com.briup.app04.bean.Questionnaire;

public interface IQuestionnaireService {
	List<Questionnaire> findAll() throws Exception;
	
	Questionnaire findById(Long id) throws Exception;
	void deleteById(Long id) throws Exception;
	void save(Questionnaire questionnaire) throws Exception;
	void update(Questionnaire questionnaire) throws Exception;
}
