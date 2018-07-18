package com.briup.app04.service;

import java.util.List;

import com.briup.app04.bean.Survey;

public interface ISurveyService {
	List<Survey> findAll() throws Exception;
	
	Survey findById(Long id) throws Exception;
	void deleteById(Long id) throws Exception;
	void save(Survey survey) throws Exception;
	void update(Survey survey) throws Exception;
}
