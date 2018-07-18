package com.briup.app04.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app04.bean.Clazz;
import com.briup.app04.dao.ClazzMapper;
import com.briup.app04.dao.extend.ClazzVMMapper;
import com.briup.app04.service.IClazzService;
import com.briup.app04.vm.ClazzVM;

@Service
public class ClazzServiceImpl implements IClazzService {
	//注入ClazzMapper 	让spring产生一个ClazzMapper的对象，然后送过来
	@Autowired
	private ClazzMapper clazzMapper;
	@Autowired
	private ClazzVMMapper clazzVMMapper;

	@Override
	public List<Clazz> findAll() throws Exception {
		return clazzMapper.findAll();
	}

	@Override
	public List<ClazzVM> findAllClazzVM() throws Exception {
		return clazzVMMapper.findAllClazzVM();
	}

}

