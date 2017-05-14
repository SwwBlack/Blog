package com.action;

import java.sql.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.bean.Article;
import com.bean.Critique;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.ArticleService;
import com.service.CritiqueService;
import com.service.OnclickService;
import com.util.Page;
@SuppressWarnings("serial")
@Controller
public class ShowArticle extends ActionSupport{
      //
	@Autowired
	private ArticleService articleService;
	@Autowired
	private CritiqueService critiqueService;
	@Autowired
	private OnclickService onclickService;
	private int aid;
	private String username;
	private Page pagebeen;//封装了分页信息和数据内容的page
	private List<Critique> list;//用于存储数据内容
	private int page = 1;
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		Map request = (Map) ActionContext.getContext().get("request");
		HttpServletRequest request2 = ServletActionContext.getRequest();
		String ip = request2.getRemoteAddr();//获取ip地址
		Date time = new Date(new java.util.Date().getTime());//获取时间
		System.out.println(ip+" "+time);
		aid = Integer.valueOf(request2.getParameter("aid"));//获取文章编号
		Article article = articleService.getArticleById(aid);//根据编号获取文章
		this.pagebeen = critiqueService.getAllCritiqueById(3, page, aid);//获取数据
		this.list = this.pagebeen.getcList();//获取数据
		if(onclickService.addOnclik(ip, aid, time)==1){//判断是否需要增加点击量
			article.setHasread(article.getHasread()+1);//点击量增加
		}
		articleService.updateArticle(article);
		Map session = ActionContext.getContext().getSession();
		session.put("clist", list);
		session.put("carticle", article);
		request.put("cpagebeens", pagebeen);
		//System.out.println(pagebeen.getAllRow());
		return SUCCESS;
	}
	//
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Page getPagebeen() {
		return pagebeen;
	}
	public void setPagebeen(Page pagebeen) {
		this.pagebeen = pagebeen;
	}
	public List<Critique> getList() {
		return list;
	}
	public void setList(List<Critique> list) {
		this.list = list;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	
}
