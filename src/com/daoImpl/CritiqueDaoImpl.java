package com.daoImpl;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.bean.Critique;
import com.dao.CritiqueDao;

@SuppressWarnings("deprecation")
public class CritiqueDaoImpl extends HibernateDaoSupport implements CritiqueDao {
	//��ȡsession
	private Session getSession(){
		return super.currentSession();
	}

	@Override
	//����ĳ���»�ȡ��������
	public int getCritiqueCountByAid(int aid) {
		// TODO Auto-generated method stub
		Session session = getSession();
		String sql = "select * from tb_critique where AID='"+aid+"'";
		return session.createSQLQuery(sql).list().size();
				
	}

	@SuppressWarnings({ "rawtypes" })
	@Override
	//����ĳ���»�ȡȫ������
	public List<Critique> getCritiqueByAid(int offset, int length, int aid) {
		// TODO Auto-generated method stub
		Session session = getSession();
		String sql = "select * from tb_critique as a where a.AID='"+aid+"'";
		SQLQuery query = session.createSQLQuery(sql).addEntity(Critique.class);
		query.setFirstResult(offset);
		query.setMaxResults(length);
		@SuppressWarnings("unchecked")
		List<Critique> list = query.list();
		//System.out.println(list.size());
		return list;
	}

}
