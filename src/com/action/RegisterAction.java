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
public class RegisterAction extends ActionSupport{
    //
	@Autowired
	private UserService userService;
	private String username; //用户名
	private String password; //密码
	private String repassword;//确认密码
	private String nickname; //昵称
	private String question;//密保问题
	private String answer;//密保答案
	//
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		HttpServletRequest request = ServletActionContext.getRequest();
		if(username==null||username.equals("")){
			request.setAttribute("info","用户名不能为空！");
			return ERROR;
		}else {
			if(!password.equals(repassword)){
				request.setAttribute("info","两次输入密码不一致！");
				return ERROR;
			}else {
				User user = new User();
				user.setUsername(username);
				user.setAnswer(answer);
				user.setNickname(nickname);
				user.setQuestion(question);
				user.setPassword(password);
				//System.out.println(nickname);
				if(userService.addUser(user)){
					request.setAttribute("info","注册成功！请登录");
					return SUCCESS;
					
				}
				else {
					request.setAttribute("info", "用户名已存在！");
					return ERROR;
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
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getRepassword() {
		return repassword;
	}
	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}
	
}
