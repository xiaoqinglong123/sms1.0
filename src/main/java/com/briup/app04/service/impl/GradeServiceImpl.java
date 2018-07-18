package com.briup.app04.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app04.bean.Grade;
import com.briup.app04.dao.GradeMapper;
import com.briup.app04.service.IGradeService;
@Service
public class GradeServiceImpl implements IGradeService{
	
	@Autowired
	private GradeMapper gradeMapper;
	
	@Override
	public List<Grade> findAll() throws Exception {
		//调用studentMapper查询所有学生
		List<Grade> list = gradeMapper.findAll();
		return list;
	}
	
	@Override
	public Grade findById(Long id) throws Exception {
		//调用studentMapper查询所有学生
		
		return gradeMapper.findById(id);
	}
	
	@Override
	public void deleteById(Long id) throws Exception {
		//1. 通过id查找
				Grade grade = gradeMapper.findById(id);
				//2. 如果该学生存在，执行删除操作，如果该学生不存在，抛出异常
				if(grade!=null){
					gradeMapper.deleteById(id);
				} else {
					throw new Exception("要删除的成绩不存在");
				}
				
	}
	@Override
	public void save(Grade grade) throws Exception{
		//调用
		 gradeMapper.save(grade);
	}
	
	@Override
	public void update(Grade grade) throws Exception{
		//调用
		
		 gradeMapper.update(grade);

	}
	
	
}

