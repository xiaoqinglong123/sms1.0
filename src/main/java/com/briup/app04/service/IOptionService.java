package com.briup.app04.service;

import java.util.List;

import com.briup.app04.bean.Option;

public interface IOptionService {
	List<Option> findAll() throws Exception;
	
	Option findById(Long id) throws Exception;
	void deleteById(Long id) throws Exception;
	void save(Option option) throws Exception;
	void update(Option option) throws Exception;
}
