package com.liu.springxml;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.liu.springxml.attribute.Student;
import com.liu.springxml.autowired.BasicService;
import com.liu.springxml.autowired.BasicService2;
import com.liu.springxml.constructor.Person;
import com.liu.springxml.lazy.Lazy;
import com.liu.springxml.map.Panda;
import com.liu.springxml.obj.BaseService;
import com.liu.springxml.properties.JdbcUtils;
import com.liu.springxml.properties.JdbcUtils2;
import com.liu.springxml.scope.Cat;
import com.liu.springxml.scope.Dog;

public class SpringTest {
	
	@Test
	public void test1(){
		ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");//classpath:/applicationContext.xml
		
		/*ApplicationContext act2 = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml","xx.xml"});*/
		
		/*ApplicationContext act3 = new FileSystemXmlApplicationContext("E:/workspace/springxml/target/classes/applicationContext.xml");*/
		
		BaseService service = (BaseService) act.getBean("baseService");
		
		service.invoke();
	}
	
	@Test
	public void test2(){
		ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");//classpath:/applicationContext.xml
		
		Student student = (Student) act.getBean("student");
		
		System.out.println(student.getUsername() + "|" + student.getAge());
	}
	
	@Test
	public void test3(){
		ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");//classpath:/applicationContext.xml
		
		Person person = (Person) act.getBean("person");
		
		System.out.println(person.getUsername() + "|" + person.getAge());
	}
	
	@Test
	public void test4(){
		ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");//classpath:/applicationContext.xml
		
		Dog dog = (Dog) act.getBean("dog");
		Dog dog2 = (Dog) act.getBean("dog");
		System.out.println(dog);
		System.out.println(dog2);
		
		
		Cat cat = (Cat) act.getBean("cat");
		Cat cat2 = (Cat) act.getBean("cat");
		System.out.println(cat);
		System.out.println(cat2);
	}
	
	@Test
	public void test5(){
		ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");//classpath:/applicationContext.xml
		
		Panda panda = (Panda) act.getBean("panda");
		
		System.out.println(panda.getMap().get("weight"));
		System.out.println(panda.getMap().get("height"));
	}
	
	@Test
	public void test6(){
		ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");//classpath:/applicationContext.xml
		
		JdbcUtils jdbcUtils = (JdbcUtils) act.getBean("jdbcUtils");
		
		System.out.println(jdbcUtils.getProperties().get("jdbc.driverClassName"));
		System.out.println(jdbcUtils.getProperties().get("jdbc.url"));
	}
	
	@Test
	public void test7(){
		ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");//classpath:/applicationContext.xml
		
		JdbcUtils2 jdbcUtils2 = (JdbcUtils2) act.getBean("jdbcUtils2");
		
		System.out.println(jdbcUtils2.getDriverClassName());
		System.out.println(jdbcUtils2.getUrl());
		System.out.println(jdbcUtils2.getUsername());
		System.out.println(jdbcUtils2.getPassword());
		
	}
	
	@Test
	public void test8(){
		ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");//classpath:/applicationContext.xml
		
		System.out.println("Spring容器已被创建");
	}
	
	@Test
	public void test9(){
		ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");//classpath:/applicationContext.xml
		
		System.out.println("Spring容器已被创建");
		
		Lazy lazy = (Lazy) act.getBean("lazy2");
	}
	
	@Test
	public void test10(){
		ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");//classpath:/applicationContext.xml
		
		BasicService basicService = (BasicService) act.getBean("basicService");
		
		basicService.deal(new Object());
	}
	
	@Test
	public void test11(){
		ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");//classpath:/applicationContext.xml
		
		BasicService2 basicService2 = (BasicService2) act.getBean("basicService2");
		
		basicService2.deal(new Object());
	}

}
