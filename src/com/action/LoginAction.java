package com.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.bean.User;
import com.opensymphony.xwork2.ActionSupport;
import com.service.UserService;
@SuppressWarnings("serial")
@Controller
@Scope("prototype")
public class LoginAction extends ActionSupport{
	@Autowired
    private UserService usersevices;
	private String username;
	private String password;
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		HttpServletRequest request = ServletActionContext.getRequest();
		if(username==null||username.equals("")){
			request.setAttribute("info", "�û�������Ϊ��!");
			return ERROR;
		}else {
			if(password==null||password.equals("")){
				request.setAttribute("info", "���벻��Ϊ��!");
				return ERROR;
			}else {
				User sUser = usersevices.findUserByname(username);
				if(sUser==null){
					request.setAttribute("info","�û���������!");
					return ERROR;
				}else{
					String pString = sUser.getPassword();
					if(!password.equals(pString)){
						request.setAttribute("info","�������!");
						return ERROR;
					}else{
						request.setAttribute("info","ע��ɹ������¼");
						return SUCCESS;
					}
				}
			}
			
			
		}
			
	}
	//
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
     
}
