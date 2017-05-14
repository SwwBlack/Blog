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
	//�õ�ĳ������������
	public int getAllCritiqueCountById(int aid){
		return critiqueDaoImpl.getCritiqueCountByAid(aid);
	}
	//�õ�ĳ����ȫ������
	public Page getAllCritiqueById(int pageSize,int curruntpage,int aid){
		int allrow = getAllCritiqueCountById(aid);//�ܼ�¼��
		int totalpage = Page.countTatalPage(pageSize, allrow);//������ҳ��
		int offset = Page.countOffset(pageSize, curruntpage);//��ǰҳ��ʼ����
		int length = pageSize;//ÿҳ��¼��
		int curruntPage = Page.countCurrentPage(curruntpage);//��ǰҳ
		List<Critique> list = critiqueDaoImpl.getCritiqueByAid(offset, length, aid);
		//�ѷ�ҳ��Ϣ���浽Bean����    
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
 