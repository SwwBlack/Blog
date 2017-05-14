package com.dao;

import java.sql.Date;

public interface OnclickDao {
     //添加点击记录
	public void addClick(int aid,String ip,Date time);
	//判断是否点击过
	public int isClick(String ip,int aid,Date time);
}
