package com.briup.app04.dao;

import java.util.List;

import com.briup.app04.bean.User;

public interface UserMapper {
	List<User> findAll();
	
	User findById(Long id);
	User deleteById(Long id);
	void save(User user);
	void update(User user);
}
