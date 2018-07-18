package com.briup.app04.service;

import java.util.List;

import com.briup.app04.bean.Qq;

public interface IQqService {
	List<Qq> findAll() throws Exception;
	
	Qq findById(Long id) throws Exception;
	void deleteById(Long id) throws Exception;
	void save(Qq qq) throws Exception;
	void update(Qq qq) throws Exception;
}
