package com.dao;

import java.sql.Date;

public interface OnclickDao {
     //��ӵ����¼
	public void addClick(int aid,String ip,Date time);
	//�ж��Ƿ�����
	public int isClick(String ip,int aid,Date time);
}
