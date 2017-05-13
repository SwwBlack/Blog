package com.action;

import java.io.File;
import java.util.Map;

import org.apache.struts2.ServletActionContext;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
@SuppressWarnings("serial")
@Controller
public class ShowPhotoAction extends ActionSupport{

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		Map session = ActionContext.getContext().getSession();
		String username = (String) session.get("username");//获取用户名
		String photoPath = ServletActionContext.getServletContext().getRealPath("/user/photo/"+username);
		File filepath = new File(photoPath);
		String[] photoList = filepath.list();
		for(int i=0;i<photoList.length;i++){
			System.out.println(photoList[i]);
		}
		Map request = (Map) ActionContext.getContext().get("request");
		request.put("photoList", photoList);
		return SUCCESS;
	}
    
}
