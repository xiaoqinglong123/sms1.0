package com.briup.app04.bean;

/**
 * POJO类
 * 
 *
 */
public class Student {
	private Long id;//Long能接收空值NULL
	private String name;
	private Integer age;
	
	public Student(){
	}
	
	public void setStudent(long i,String name,Integer age){
		this.id = i;
		this.name = name;
		this.age = age;
	}
	public Long getId() {
		return id;
	}
	public void setId(long i) {
		this.id = i;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
}

