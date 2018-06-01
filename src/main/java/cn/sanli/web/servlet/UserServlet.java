package cn.sanli.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.sanli.entity.User;
import cn.sanli.mapper.UserMapper;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/UserServlet")
//@Service(value="userServlet")
public class UserServlet extends HttpServlet {
	@Autowired
	private UserMapper userMapper;
	private static final long serialVersionUID = 1L;
	
	
	public UserServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String method = request.getParameter("method");

		if (method.equals("add")) {
			addUser(request, response);
		}
		else if (method.equals("modify")) {

		}
		else if (method.equals("update")) {

		}
		else if (method.equals("delete")) {

		}
	}

	private void addUser(HttpServletRequest request, HttpServletResponse response) {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		
		User u = new User(username, password);
		userMapper.addUser(u);

	}

	public UserMapper getUserMapper() {
		return userMapper;
	}

	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}
	
	
}
