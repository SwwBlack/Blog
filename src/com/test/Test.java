package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.User;
import com.dao.UserDao;
import com.daoImpl.UserDaoImpl;
import com.service.UserService;


public class Test {
    /*
	@org.junit.Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        javax.sql.DataSource dataSource = context.getBean(javax.sql.DataSource.class);
        System.out.println(dataSource);
	}*/
	@org.junit.Test
	public void Testdb(){
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) context.getBean("userService");
        User user = userService.findUserByname("sww");
        if(user==null)
        	System.out.println("³É¹¦£¡");
        
	}
	

}
