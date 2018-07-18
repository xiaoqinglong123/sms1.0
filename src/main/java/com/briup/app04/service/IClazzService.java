package com.briup.app04.service;

import java.util.List;

import com.briup.app04.bean.Clazz;
import com.briup.app04.vm.ClazzVM;

public interface IClazzService {
	List<Clazz> findAll() throws Exception;
	
	List<ClazzVM> findAllClazzVM() throws Exception;
}
