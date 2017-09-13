package com.yummy.dao;

import java.util.List;

import com.yummy.model.Person;

public interface PersonMapper {
	public Person findById(String Id);
	public List<Person> getAllPerson();
}
