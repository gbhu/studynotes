package com.yummy.model;

import java.util.List;

public class Student {
	private int id;

	private String name;
	private String age;
	private String sex;
	private List<Schedule> scheduleList;


	public List<Schedule> getScheduleList() {
		return scheduleList;
	}

	public Student setScheduleList(List<Schedule> scheduleList) {
		this.scheduleList = scheduleList;
		return this;
	}


	public Student() {

	}




	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}


}
