package com.daoImpl;


import java.util.List;

import org.hibernate.Session;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.bean.User;
import com.dao.UserDao;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {
	public  Session getSession(){
		return super.currentSession();
	}
	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
        
	}
	@Override
	//通过用户名查找用户
	public User findUser(String username) {
		// TODO Auto-generated method stub
		Session session = getSession();
		String sql = "select * from tb_user where username='"+username+"'";
		@SuppressWarnings({ "deprecation", "unchecked" })
		List<User> list = session.createSQLQuery(sql).addEntity(User.class).list();
		if(list.size()==0)
			return null;
		User user = list.get(0);
		return user;
		}
	

}
