package com.dao;

import java.util.List;

import com.bean.Article;

public interface ArticleDao {
    public int getAllArticleCount();//��ȡȫ����������
    public int getAllArticleCountByName(String username);//��ȡĳ�û���������
    public void addNewArticle(Article article);//���������
	public List<Article> getAllArticle(final int offset, final int length);//��ȡ��ҳ�����е�����
	public List<Article> getAllArticleByName(final int offset,final int length,String username);//��ȡ�û�ȫ�����£�
	public Article getArticleById(int id);
	public void updateArticle(Article article);//��������
	
}
