package com.dao;

import java.util.List;

import com.bean.Article;

public interface ArticleDao {
    public int getAllArticleCount();//获取全部文章总数
    public int getAllArticleCountByName(String username);//获取某用户文章总数
    public int addNewArticle(Article article);//添加新文章
	public List<Article> getAllArticle(final int offset, final int length);//获取分页数据中的文章
	public List<Article> getAllArticleByName(final int offset,final int length,String username);//获取用户文章；
}
