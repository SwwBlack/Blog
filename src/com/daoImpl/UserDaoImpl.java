package com.daoImpl;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import com.bean.User;
import com.dao.UserDao;

@SuppressWarnings("deprecation")
public class UserDaoImpl extends HibernateDaoSupport implements UserDao {
	public  Session getSession(){
		return super.currentSession();
	}
	@Override
	public void add(User user) {//添加用户
		// TODO Auto-generated method stub
        Session session = getSession();
        String sql = "insert into tb_user values(?,?,?,?,?)";
        @SuppressWarnings({ "rawtypes" })
		Query query = session.createSQLQuery(sql);
        query.setString(0,user.getUsername());
        query.setString(1,user.getPassword());
        query.setString(2,user.getNickname());
        query.setString(3,user.getQuestion());
        query.setString(4,user.getAnswer());
        query.executeUpdate();
	}
	@Override
	//通过用户名查找用户
	public User findUser(String username) {
		// TODO Auto-generated method stub
		Session session = getSession();
		String sql = "select * from tb_user where username='"+username+"'";
		@SuppressWarnings({ "unchecked" })
		List<User> list = session.createSQLQuery(sql).addEntity(User.class).list();
		if(list.size()==0)
			return null;
		User user = list.get(0);
		return user;
		}
	

}
