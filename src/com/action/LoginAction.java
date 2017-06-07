package com.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
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
	//private final Logger logger = Logger.getLogger("OperateLog");//定义日志对象
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		HttpServletRequest request = ServletActionContext.getRequest();
		if(username==null||username.equals("")){
			request.setAttribute("info", "用户名不能为空!");
			return ERROR;
		}else {
			if(password==null||password.equals("")){
				request.setAttribute("info", "密码不能为空!");
				return ERROR;
			}else {
				User sUser = usersevices.findUserByname(username);
				if(sUser==null){
					request.setAttribute("info","用户名不存在!");
					return ERROR;
				}else{
					String pString = sUser.getPassword();
					if(!password.equals(pString)){
						request.setAttribute("info","密码错误!");
						return ERROR;
					}else{
						//logger.info("用户"+sUser.getUsername()+"登录了");//登陆信息写入日志
						request.getSession().setAttribute("nickname",sUser.getNickname());
						request.getSession().setAttribute("username",sUser.getUsername());
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
