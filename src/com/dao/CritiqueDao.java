package com.dao;

import java.util.List;

import com.bean.Critique;

public interface CritiqueDao {
    public int getCritiqueCountByAid(int aid);//根据某文章获取评论总数
    public List<Critique> getCritiqueByAid(final int offset,final int length,int aid);//根据某文章获取全部评论
}
