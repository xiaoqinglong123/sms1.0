package com.briup.app04.dao;

import java.util.List;

import com.briup.app04.bean.School;

public interface SchoolMapper {	
	List<School> findAll();
	
	School findById(Long id);
	School deleteById(Long id);
	void save(School school);
	void update(School school);
}
