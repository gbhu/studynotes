package com.yummy.service.imp;

import com.yummy.dao.PersonMapper;
import com.yummy.model.Person;
import com.yummy.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by yummy on 2017/9/22.
 */
@Service("personService")
public class PersonServiceImp  implements PersonService{

    @Resource
    PersonMapper personMapper;

    public Person findById(String Id) {
        return personMapper.findById(Id);
    }

    public List<Person> getAllPerson() {
        return personMapper.getAllPerson();
    }
}
