package com.briup.app04.service;

import java.util.List;

import com.briup.app04.bean.User;

public interface IUserService {
	List<User> findAll() throws Exception;
	
	User findById(Long id) throws Exception;
	void deleteById(Long id) throws Exception;
	void save(User user) throws Exception;
	void update(User user) throws Exception;
}
