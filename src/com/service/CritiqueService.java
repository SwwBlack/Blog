package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Critique;
import com.daoImpl.CritiqueDaoImpl;
import com.util.Page;
@Service
public class CritiqueService {
     //
	@Autowired
	private CritiqueDaoImpl critiqueDaoImpl;
	//得到某文章评论总数
	public int getAllCritiqueCountById(int aid){
		return critiqueDaoImpl.getCritiqueCountByAid(aid);
	}
	//得到某文章全部评论
	public Page getAllCritiqueById(int pageSize,int curruntpage,int aid){
		int allrow = getAllCritiqueCountById(aid);//总记录数
		int totalpage = Page.countTatalPage(pageSize, allrow);//计算总页数
		int offset = Page.countOffset(pageSize, curruntpage);//当前页开始计数
		int length = pageSize;//每页记录数
		int curruntPage = Page.countCurrentPage(curruntpage);//当前页
		List<Critique> list = critiqueDaoImpl.getCritiqueByAid(offset, length, aid);
		//把分页信息保存到Bean当中    
		Page pageBean  = new Page();    
		pageBean.setPageSize(pageSize);    
		pageBean.setCurrentPage(curruntPage);    
		pageBean.setAllRow(allrow);    
		pageBean.setTotalPage(totalpage);    
		pageBean.setcList(list);    
		pageBean.init();    
		return pageBean;	
	}
}
 