package com.yummy.test;

import java.io.IOException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yummy.dao.PersonMapper;
import com.yummy.model.Person;

public class test {
	private static ApplicationContext ctx;

	static {
		ctx = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
	}

	public static void main(String[] args) throws IOException {
		/*
		 * SqlSession sqlSession = new
		 * MybatisFactory().getSqlSessionFactory().openSession(); PersonMapper
		 * personMapper = sqlSession.getMapper(PersonMapper.class); Person
		 * person = personMapper.findById("1");
		 * System.out.println(person.getName());
		 * List<Person>list=personMapper.getAllPerson();
		 * System.out.println(list.get(0).getAge());
		 */

		PersonMapper mapper = (PersonMapper) ctx.getBean("personMapper");
		// 测试id=1的用户查询，根据数据库中的情况，可以改成你自己的.
		System.out.println("得到用户id=1的用户信息");
		Person perosn = mapper.findById("1");
		System.out.println(perosn.getName());

	}
}
