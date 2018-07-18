package com.briup.app04.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app04.bean.School;
import com.briup.app04.dao.SchoolMapper;
import com.briup.app04.service.ISchoolService;
@Service
public class SchoolServiceImpl implements ISchoolService{
	
	@Autowired
	private SchoolMapper schoolMapper;
	
	@Override
	public List<School> findAll() throws Exception {
		//调用studentMapper查询所有学生
		List<School> list = schoolMapper.findAll();
		return list;
	}
	
	@Override
	public School findById(Long id) throws Exception {
		//调用studentMapper查询所有学生
		
		return schoolMapper.findById(id);
	}
	
	@Override
	public void deleteById(Long id) throws Exception {
		//1. 通过id查找
				School school = schoolMapper.findById(id);
				//2. 如果该学生存在，执行删除操作，如果该学生不存在，抛出异常
				if(school!=null){
					schoolMapper.deleteById(id);
				} else {
					throw new Exception("要删除的学校不存在");
				}
				
	}
	@Override
	public void save(School school) throws Exception{
		//调用
		 schoolMapper.save(school);
	}
	
	@Override
	public void update(School school) throws Exception{
		//调用
		
		 schoolMapper.update(school);

	}
	
	
}

