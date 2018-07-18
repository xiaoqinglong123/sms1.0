package com.briup.app04.service;

import java.util.List;

import com.briup.app04.bean.Grade;

public interface IGradeService {
	List<Grade> findAll() throws Exception;
	
	Grade findById(Long id) throws Exception;
	void deleteById(Long id) throws Exception;
	void save(Grade grade) throws Exception;
	void update(Grade grade) throws Exception;
}
