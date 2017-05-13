package com.action;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.bean.Article;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.ArticleService;
@SuppressWarnings("serial")
@Controller
public class WriteArticleAction extends ActionSupport{
	//
	@Autowired
     private ArticleService articleService ;
	 private String title;
	 private String content;

	@SuppressWarnings("rawtypes")
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		Map session = ActionContext.getContext().getSession();
		Article article = new Article();
		article.setTitle(title);
		article.setContent(content);
		System.out.println(title+" "+content);
		article.setUsername((String)session.get("username"));
		if(articleService.writeArticle(article)==1){
			System.out.println("success");
			return SUCCESS;
		    	
		}
		else {
			return ERROR;
		}
			
	}
     //

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
}
