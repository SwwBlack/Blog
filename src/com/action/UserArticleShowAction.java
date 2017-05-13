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
public class UserArticleShowAction extends ActionSupport{
	@Autowired
	private ArticleService articleService ;//通过Spring创建业务层对象  使用set方法依赖注入
	private Page upagebeen;//封装了分页信息和数据内容的page
	private List<Article> ulist;//用于存储数据内容
	private int page = 1;
	//
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		Map session = ActionContext.getContext().getSession();
		String username = (String) session.get("username");
		this.upagebeen = articleService.getArticlePageByName(3, page,username);
		this.ulist = this.upagebeen.getList();//获取数据
		session.put("ulist", ulist);
		Map request = (Map) ActionContext.getContext().get("request");
		request.put("upagebeens", upagebeen);
		//System.out.println(upagebeen.getAllRow());
		return SUCCESS;
	}
	//
	public Page getUpagebeen() {
		return upagebeen;
	}
	
	public void setUpagebeen(Page upagebeen) {
		this.upagebeen = upagebeen;
	}
	public List<Article> getUlist() {
		return ulist;
	}
	public void setList(List<Article> ulist) {
		this.ulist = ulist;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	
}
