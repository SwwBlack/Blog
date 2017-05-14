package com.daoImpl;

import java.sql.Date;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.dao.OnclickDao;

@SuppressWarnings("deprecation")
public class OnclickDaoImpl extends HibernateDaoSupport implements OnclickDao {
    //
	private Session getSession(){
		return super.currentSession();
	}
	@SuppressWarnings({ "rawtypes" })
	@Override
	//增加点击记录
	public void addClick(int aid, String ip, Date time) {
		// TODO Auto-generated method stub
          Session session = getSession();//获取session
          String sql = "insert into tb_onclick(AID,IP,DATE) values(?,?,?)";
          SQLQuery query = session.createSQLQuery(sql);
          query.setInteger(0, aid);
          query.setString(1,ip);
          query.setDate(2, time);
          query.executeUpdate();
	}
	@SuppressWarnings("rawtypes")
	@Override
	public int isClick(String ip, int aid, Date time) {
		// TODO Auto-generated method stub
		Session session = getSession();
		String sql = "select c from Onclick c where c.ip=? and c.Aid=? and c.date=?";
		Query query = session.createQuery(sql);
		query.setString(0, ip);
		query.setInteger(1, aid);
		query.setDate(2, time);
		return query.list().size();
        
	}

}
