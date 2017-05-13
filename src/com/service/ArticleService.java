package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Article;
import com.daoImpl.ArticleDaoImpl;
import com.util.Page;
@Service
public class ArticleService {
    //
	@Autowired
	private ArticleDaoImpl articleDaoImpl;
	/**
	 * 获取含有全部文章的pagebeen
	 * pageSize:每页显示多少记录
	 * curruntpage:当前页
	 */
	public Page getArticlePage(int pageSize,int curruntpage){
		int allrow = articleDaoImpl.getAllArticleCount();//总记录数
		int totalpage = Page.countTatalPage(pageSize, allrow);//计算总页数
		int offset = Page.countOffset(pageSize, curruntpage);//当前页开始计数
		int length = pageSize;//每页记录数
		int curruntPage = Page.countCurrentPage(curruntpage);//当前页
		List<Article> list = articleDaoImpl.getAllArticle(offset, length);
		//把分页信息保存到Bean当中    
		Page pageBean  = new Page();    
		pageBean.setPageSize(pageSize);    
		pageBean.setCurrentPage(curruntPage);    
		pageBean.setAllRow(allrow);    
		pageBean.setTotalPage(totalpage);    
		pageBean.setList(list);    
		pageBean.init();    
		return pageBean;
		
		
	}
	//写日志
	public int writeArticle(Article article){
		if(article.getTitle()==null||article.getTitle().equals("")){
			return 0;
		}
		else {
			return articleDaoImpl.addNewArticle(article);
		}
			
	}
	/**
	 * 获取含有全部文章的pagebeen
	 * pageSize:每页显示多少记录
	 * curruntpage:当前页
	 * username:用户名
	 */
	public Page getArticlePageByName(int pageSize,int curruntpage,String username){
		int allrow = articleDaoImpl.getAllArticleCountByName(username);//总记录数
		int totalpage = Page.countTatalPage(pageSize, allrow);//计算总页数
		int offset = Page.countOffset(pageSize, curruntpage);//当前页开始计数
		int length = pageSize;//每页记录数
		int curruntPage = Page.countCurrentPage(curruntpage);//当前页
		List<Article> list = articleDaoImpl.getAllArticleByName(offset, length,username);
		//把分页信息保存到Bean当中    
		Page pageBean  = new Page();    
		pageBean.setPageSize(pageSize);    
		pageBean.setCurrentPage(curruntPage);    
		pageBean.setAllRow(allrow);    
		pageBean.setTotalPage(totalpage);    
		pageBean.setList(list);    
		pageBean.init();    
		return pageBean;
		
		
	}
}
