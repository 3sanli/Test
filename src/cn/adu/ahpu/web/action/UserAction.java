package cn.adu.ahpu.web.action;


import java.util.Map;

import cn.adu.ahpu.domain.User;
import cn.adu.ahpu.service.UserService;
import cn.adu.ahpu.service.impl.UserServiceImpl;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class UserAction extends ActionSupport implements Preparable{
	private User u = new User();
	private UserService us = new UserServiceImpl();
	public String login(){
		User user = us .login(u);
		Map<String, Object> session = ActionContext.getContext().getSession();
		session.put("user", user);
		return "login";
	}
	@Override
	public void prepare() throws Exception {
		ActionContext.getContext().getValueStack().push(u);
		
	}
}
