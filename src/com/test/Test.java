package com.test;

import java.util.List;

import org.junit.Ignore;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Article;
import com.bean.User;
import com.service.ArticleService;
import com.service.UserService;
import com.util.Page;


public class Test {
    /*
	@org.junit.Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        javax.sql.DataSource dataSource = context.getBean(javax.sql.DataSource.class);
        System.out.println(dataSource);
	}*/
	@Ignore
	@org.junit.Test
	public void Testdb(){
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) context.getBean("userService");
        User user = userService.findUserByname("sww");
        if(user!=null)
        	System.out.println("³É¹¦£¡");
        
	}
	@Ignore
	@org.junit.Test
	public void testArticle(){
		@SuppressWarnings("resource")
		ApplicationContext conte = new ClassPathXmlApplicationContext("applicationContext.xml");
		ArticleService articleService = conte.getBean(ArticleService.class);
		Page page = articleService.getArticlePage(4, 1);
		List<Article> list = page.getList();
		for (Article article : list) {
			System.out.println(article.getTitle());
		}
	}
	

}
