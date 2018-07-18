package com.briup.app04.service;

import java.util.List;

import com.briup.app04.bean.School;

public interface ISchoolService {
	List<School> findAll() throws Exception;
	
	School findById(Long id) throws Exception;
	void deleteById(Long id) throws Exception;
	void save(School school) throws Exception;
	void update(School school) throws Exception;
}
