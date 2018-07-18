package com.briup.app04.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app04.bean.User;
import com.briup.app04.service.IUserService;
import com.briup.app04.util.MsgResponse;

@RestController
@RequestMapping("/user")
public class UserController {
	//注入studentService的实例
	@Autowired
	private IUserService userService;
	
	//http://127.0.0.1:8080/student/findAllStudent
	@GetMapping("findAllUser")
	public List<User> findAllUser(){
		
		try {
			List<User> list = userService.findAll();
			return list;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	@GetMapping("findUserById")
	public User findUserById(Long id){
		try {
			User user = userService.findById(id);
			return user;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@GetMapping("deleteUserById")
	public MsgResponse deleteById(Long id){
		try {
			userService.deleteById(id);
			return MsgResponse.success("删除成功", null);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	/**
	 * @author Administrator
	 * @param student
	 * @return
	 */
	@PostMapping("saveUser")
	public String saveUser(User user){
		try {
			userService.save(user);
			return "保存成功";
		} catch (Exception e) {
			e.printStackTrace();
			return "失败";
		}
	}
	@PostMapping("updateUser")
	public String updateUser(User user){
		try {
			userService.update(user);
			return "修改成功";
		} catch (Exception e) {
			e.printStackTrace();
			return "失败";
		}
	}
	
}

