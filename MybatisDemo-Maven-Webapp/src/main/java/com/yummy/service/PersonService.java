package com.yummy.service;

import com.yummy.model.Person;

import java.util.List;

/**
 * Created by yummy on 2017/9/22.
 */
public interface PersonService {
    public Person findById(String Id);
    public List<Person> getAllPerson();

}
