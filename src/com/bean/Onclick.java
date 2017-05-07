package com.bean;

import java.sql.Date;

public class Onclick {
      private int Id;
      private int Aid;
      private String ip;
      private Date date;
      //
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getAid() {
		return Aid;
	}
	public void setAid(int aid) {
		Aid = aid;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
      
}
