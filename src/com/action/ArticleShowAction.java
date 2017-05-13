package com.action;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.bean.Article;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.ArticleService;
import com.util.Page;
@SuppressWarnings("serial")
@Controller
public class ArticleShowAction extends ActionSupport{
    //
	@Autowired
	private ArticleService articleService ;//通过Spring创建业务层对象  使用set方法依赖注入
	private Page pagebeen;//封装了分页信息和数据内容的page
	private List<Article> list;//用于存储数据内容
	private int page = 1;
	//
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		this.pagebeen = articleService.getArticlePage(3, page);
		this.list = this.pagebeen.getList();//获取数据
		Map session = ActionContext.getContext().getSession();
		session.put("list", list);
		Map request = (Map) ActionContext.getContext().get("request");
		request.put("pagebeens", pagebeen);
		//System.out.println(pagebeen.getAllRow());
		return SUCCESS;
	}
	//
	public Page getPagebeen() {
		return pagebeen;
	}
	
	public void setPagebeen(Page pagebeen) {
		this.pagebeen = pagebeen;
	}
	public List<Article> getList() {
		return list;
	}
	public void setList(List<Article> list) {
		this.list = list;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	
	
}
