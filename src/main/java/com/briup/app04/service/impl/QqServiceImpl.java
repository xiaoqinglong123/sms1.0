package com.briup.app04.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app04.bean.Qq;
import com.briup.app04.dao.QqMapper;
import com.briup.app04.service.IQqService;
@Service
public class QqServiceImpl implements IQqService{
	
	@Autowired
	private QqMapper qqMapper;
	
	@Override
	public List<Qq> findAll() throws Exception {
		//调用qqMapper查询所有学生
		List<Qq> list = qqMapper.findAll();
		return list;
	}
	
	@Override
	public Qq findById(Long id) throws Exception {
		//调用qqMapper查询所有学生
		
		return qqMapper.findById(id);
	}
	
	@Override
	public void deleteById(Long id) throws Exception {
		//1. 通过id查找
				Qq qq = qqMapper.findById(id);
				//2. 如果该学生存在，执行删除操作，如果该学生不存在，抛出异常
				if(qq!=null){
					qqMapper.deleteById(id);
				} else {
					throw new Exception("要删除的qq不存在");
				}
				
	}
	@Override
	public void save(Qq qq) throws Exception{
		//调用
		 qqMapper.save(qq);
	}
	
	@Override
	public void update(Qq qq) throws Exception{
		//调用
		
		 qqMapper.update(qq);

	}
	
	
}

