package com.service;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daoImpl.OnclickDaoImpl;

@Service
public class OnclickService {
   //
	@Autowired
	private OnclickDaoImpl onclickDaoImpl;
	//
	//�жϵ�����Ƿ�Ӧ������
	public int addOnclik(String ip,int aid,Date time){
		if(onclickDaoImpl.isClick(ip, aid, time)>=1){
			return 0;
		}
		else {
			onclickDaoImpl.addClick(aid, ip, time);
			return 1;
		}
	}
}
