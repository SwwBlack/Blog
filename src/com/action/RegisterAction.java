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
	private String username; //�û���
	private String password; //����
	private String repassword;//ȷ������
	private String nickname; //�ǳ�
	private String question;//�ܱ�����
	private String answer;//�ܱ���
	//
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		HttpServletRequest request = ServletActionContext.getRequest();
		if(username==null||username.equals("")){
			request.setAttribute("info","�û�������Ϊ�գ�");
			return ERROR;
		}else {
			if(!password.equals(repassword)){
				request.setAttribute("info","�����������벻һ�£�");
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
					request.setAttribute("info","ע��ɹ������¼");
					return SUCCESS;
					
				}
				else {
					request.setAttribute("info", "�û����Ѵ��ڣ�");
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
