package com.xiaocui.test;

import java.util.Date;

/**
 * ClassName: Student
 * @Description: 测试数据导出
 * @author dapengniao
 * @date 2016年3月7日 下午5:10:43
 */
public class Student {
	private int id;
	private String name;
	private int age;
	private Date birth;

	public Student(int id, String name, int age, Date birth) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.birth = birth;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}
}