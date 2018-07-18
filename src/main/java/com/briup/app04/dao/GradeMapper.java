package com.briup.app04.dao;

import java.util.List;

import com.briup.app04.bean.Grade;

public interface GradeMapper {
	List<Grade> findAll();
	
	Grade findById(Long id);
	Grade deleteById(Long id);
	void save(Grade grade);
	void update(Grade grade);
}
