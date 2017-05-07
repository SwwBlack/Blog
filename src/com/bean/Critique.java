package com.bean;

public class Critique {
      private int Id;
      private int Aid;
      private String username;
      private String content;
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
      
}
