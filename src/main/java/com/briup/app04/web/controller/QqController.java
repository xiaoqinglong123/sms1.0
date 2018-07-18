package com.briup.app04.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app04.bean.Qq;
import com.briup.app04.service.IQqService;
import com.briup.app04.util.MsgResponse;

@RestController
@RequestMapping("/Qq")
public class QqController {
	//注入studentService的实例
	@Autowired
	private IQqService qqService;
	
	//http://127.0.0.1:8080/student/findAllStudent
	@GetMapping("findAllQq")
	public List<Qq> findAllQq(){
		
		try {
			List<Qq> list = qqService.findAll();
			return list;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	@GetMapping("findQqById")
	public Qq findQqById(Long id){
		try {
			Qq qq = qqService.findById(id);
			return qq;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@GetMapping("deleteQqById")
	public MsgResponse deleteById(Long id){
		try {
			qqService.deleteById(id);
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
	@PostMapping("saveQq")
	public String saveQq(Qq qq){
		try {
			qqService.save(qq);
			return "保存成功";
		} catch (Exception e) {
			e.printStackTrace();
			return "失败";
		}
	}
	@PostMapping("updateQq")
	public String updateQq(Qq qq){
		try {
			qqService.update(qq);
			return "修改成功";
		} catch (Exception e) {
			e.printStackTrace();
			return "失败";
		}
	}
	
}
