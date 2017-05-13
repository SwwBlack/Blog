package com.daoImpl;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.bean.Article;
import com.dao.ArticleDao;

@SuppressWarnings("deprecation")
public class ArticleDaoImpl extends HibernateDaoSupport implements ArticleDao {
    
	private Session getSession(){
		return super.currentSession();
	}
	
	@Override
	
	/**
	 * 获取文章的方法
	 * offset:开始记录
	 * length:查询的记录数
	 */
	public List<Article> getAllArticle(int offset,int length) {
		// TODO Auto-generated method stub
		Session session = getSession();
		String sql = "select * from tb_article";
		@SuppressWarnings("rawtypes")
		SQLQuery query = session.createSQLQuery(sql).addEntity(Article.class);
		query.setFirstResult(offset);
		query.setMaxResults(length);
		@SuppressWarnings("unchecked")
		List<Article> list = query.list();
		System.out.println(list.size());
		return list;
	}

	@Override
	//添加新文章
	public int addNewArticle(Article article) {
		// TODO Auto-generated method stub
		Session session = getSession();
		String sql = "insert into tb_article(TITLE,CONTENT,USERNAME,DATE) values(?,?,?,?)";
		@SuppressWarnings("rawtypes")
		SQLQuery query = session.createSQLQuery(sql);
		query.setString(0, article.getTitle());
		query.setString(1, article.getContent());
		query.setString(2, article.getUsername());
		query.setDate(3,new java.util.Date());
		query.executeUpdate();
		return 1;
	}
    //获取总记录数
	@Override
	public int getAllArticleCount() {
		// TODO Auto-generated method stub
		Session session = getSession();
		String sql = "select * from tb_article";	
		return session.createSQLQuery(sql).list().size();
				
	}

	@SuppressWarnings("rawtypes")
	/**
	 * 获取用户文章的方法
	 * offset:开始记录
	 * length:查询的记录数
	 * username:用户名
	 */
	@Override
	public List<Article> getAllArticleByName(int offset, int length,String username) {
		// TODO Auto-generated method stub
		Session session = getSession();
		String sql = "select * from tb_article as a where a.USERNAME='"+username+"'";
		SQLQuery query = session.createSQLQuery(sql).addEntity(Article.class);
		query.setFirstResult(offset);
		query.setMaxResults(length);
		@SuppressWarnings("unchecked")
		List<Article> list = query.list();
		System.out.println(list.size());
		return list;
	}

	@Override
	//获取某用户文章总数
	public int getAllArticleCountByName(String username) {
		// TODO Auto-generated method stub
		Session session = getSession();
		String sql = "select * from tb_article where USERNAME='"+username+"'";
		return session.createSQLQuery(sql).list().size();
	}

}
