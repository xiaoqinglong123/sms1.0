package com.briup.app04.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app04.bean.Option;
import com.briup.app04.service.IOptionService;
import com.briup.app04.util.MsgResponse;

@RestController
@RequestMapping("/option")
public class OptionController {
	//注入studentService的实例
	@Autowired
	private IOptionService optionService;

	@GetMapping("findAllOption")
	public List<Option> findAllOption(){
		
		try {
			List<Option> list = optionService.findAll();
			return list;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	@GetMapping("findOptionById")
	public Option findOptionById(Long id){
		try {
			Option option = optionService.findById(id);
			return option;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@GetMapping("deleteOptionById")
	public MsgResponse deleteById(Long id){
		try {
			optionService.deleteById(id);
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
	@PostMapping("saveOption")
	public String saveOption(Option option){
		try {
			optionService.save(option);
			return "保存成功";
		} catch (Exception e) {
			e.printStackTrace();
			return "失败";
		}
	}
	@PostMapping("updateOption")
	public String updateOption(Option option){
		try {
			optionService.update(option);
			return "修改成功";
		} catch (Exception e) {
			e.printStackTrace();
			return "失败";
		}
	}
	
}

