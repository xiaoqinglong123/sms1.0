package com.briup.app04.dao;

import java.util.List;

import com.briup.app04.bean.Survey;

public interface SurveyMapper {
	List<Survey> findAll();
	
	Survey findById(Long id);
	Survey deleteById(Long id);
	void save(Survey survey);
	void update(Survey survey);
}
