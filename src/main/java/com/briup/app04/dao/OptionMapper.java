package com.briup.app04.dao;

import java.util.List;

import com.briup.app04.bean.Option;

public interface OptionMapper {
	List<Option> findByQuestionId(Long id); 
	
	List<Option> findAll();

	Option findById(Long id);

	void deleteById(Long id);

	void save(Option option);

	void update(Option option);
	
	
}
