package com.briup.app04.dao;

import java.util.List;

import com.briup.app04.bean.Questionnaire;

public interface QuestionnaireMapper {
	List<Questionnaire> findAll();
	
	Questionnaire findById(Long id);
	Questionnaire deleteById(Long id);
	void save(Questionnaire questionnaire);
	void update(Questionnaire questionnaire);
}
