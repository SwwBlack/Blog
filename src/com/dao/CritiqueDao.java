package com.dao;

import java.util.List;

import com.bean.Critique;

public interface CritiqueDao {
    public int getCritiqueCountByAid(int aid);//����ĳ���»�ȡ��������
    public List<Critique> getCritiqueByAid(final int offset,final int length,int aid);//����ĳ���»�ȡȫ������
}
