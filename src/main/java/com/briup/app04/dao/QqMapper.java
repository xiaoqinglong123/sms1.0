package com.briup.app04.dao;

import java.util.List;

import com.briup.app04.bean.Qq;

public interface QqMapper {
	List<Qq> findAll();
	
	Qq findById(Long id);
	Qq deleteById(Long id);
	void save(Qq qq);
	void update(Qq qq);
}
