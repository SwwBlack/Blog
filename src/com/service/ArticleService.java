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
	 * ��ȡ����ȫ�����µ�pagebeen
	 * pageSize:ÿҳ��ʾ���ټ�¼
	 * curruntpage:��ǰҳ
	 */
	public Page getArticlePage(int pageSize,int curruntpage){
		int allrow = articleDaoImpl.getAllArticleCount();//�ܼ�¼��
		int totalpage = Page.countTatalPage(pageSize, allrow);//������ҳ��
		int offset = Page.countOffset(pageSize, curruntpage);//��ǰҳ��ʼ����
		int length = pageSize;//ÿҳ��¼��
		int curruntPage = Page.countCurrentPage(curruntpage);//��ǰҳ
		List<Article> list = articleDaoImpl.getAllArticle(offset, length);
		//�ѷ�ҳ��Ϣ���浽Bean����    
		Page pageBean  = new Page();    
		pageBean.setPageSize(pageSize);    
		pageBean.setCurrentPage(curruntPage);    
		pageBean.setAllRow(allrow);    
		pageBean.setTotalPage(totalpage);    
		pageBean.setList(list);    
		pageBean.init();    
		return pageBean;
		
		
	}
	//д��־
	public int writeArticle(Article article){
		if(article.getTitle()==null||article.getTitle().equals("")){
			return 0;
		}
		else {
			return articleDaoImpl.addNewArticle(article);
		}
			
	}
	/**
	 * ��ȡ����ȫ�����µ�pagebeen
	 * pageSize:ÿҳ��ʾ���ټ�¼
	 * curruntpage:��ǰҳ
	 * username:�û���
	 */
	public Page getArticlePageByName(int pageSize,int curruntpage,String username){
		int allrow = articleDaoImpl.getAllArticleCountByName(username);//�ܼ�¼��
		int totalpage = Page.countTatalPage(pageSize, allrow);//������ҳ��
		int offset = Page.countOffset(pageSize, curruntpage);//��ǰҳ��ʼ����
		int length = pageSize;//ÿҳ��¼��
		int curruntPage = Page.countCurrentPage(curruntpage);//��ǰҳ
		List<Article> list = articleDaoImpl.getAllArticleByName(offset, length,username);
		//�ѷ�ҳ��Ϣ���浽Bean����    
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
