package cn.sanli.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public LoginServlet() {
        super();       
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		doPost(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String method = request.getParameter("method");
		if(method.equals("login")) {
			login(request,response);
		}
		
	}
	
	private void login(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		if(username.startsWith("ahpu_") && password.equals("123")) {
			HttpSession session = request.getSession();
			session.setAttribute("user", username);
			response.sendRedirect(request.getContextPath()+"/messageBoard.jsp");
		}
		else {
			response.sendRedirect(request.getContextPath()+"/login.jsp");
		}		
	}
}
