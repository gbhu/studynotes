package com.yummy.test;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yummy.dao.StudentMapper;
import com.yummy.model.Student;

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

		StudentMapper mapper = (StudentMapper) ctx.getBean("personMapper");
		// ����id=1���û���ѯ���������ݿ��е���������Ըĳ����Լ���.
		System.out.println("�õ��û�id=1���û���Ϣ");
		Student perosn = mapper.findById("1");
		System.out.println(perosn.getName());

	}
}
