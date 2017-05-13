package com.util;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

@SuppressWarnings("serial")
public class UserLoginInterceptor extends AbstractInterceptor{

	@SuppressWarnings({ "static-access", "rawtypes" })
	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		// TODO Auto-generated method stub
		ActionContext context = arg0.getInvocationContext();
		HttpServletRequest request = ServletActionContext.getRequest();
		Map session = context.getContext().getSession();
        System.out.println(session.values());
		String username = (String) session.get("username");
		System.out.println(username+"À¹½ØÆ÷");
		if(username==null||username.equals("")){
			request.setAttribute("info", "ÇëÏÈµÇÂ¼£¡");
			return Action.LOGIN;
			}
		else {
			return arg0.invoke();
		}
		
	}

}
