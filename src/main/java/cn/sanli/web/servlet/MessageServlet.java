package cn.sanli.web.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.sanli.entity.Message;

public class MessageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public MessageServlet() {
        super();       
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		doPost(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String method = request.getParameter("method");
		
		if(method.equals("addMessage")) {
			addMessage(request,response);
		}
		
	}
	
	private void addMessage(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		HttpSession session = request.getSession();
		String username = (String)session.getAttribute("user");
		
		ServletContext application = session.getServletContext();
		
		Message message = new Message(username, title, content);
		
		List<Message> messageList = (List<Message>) application.getAttribute("messageList");
		if(messageList == null) {
			messageList = new ArrayList<Message>();
		}
		
		messageList.add(message);
		application.setAttribute("messageList", messageList);
		response.sendRedirect(request.getContextPath()+"/showMessage.jsp");
		
	}
	
}
