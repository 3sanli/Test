package cn.sanli.utils.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebFilter("/LoginChecker")
public class LoginChecker implements Filter {
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		
		String user = (String) req.getSession().getAttribute("user");
		
		if((req.getContextPath()+"/login.jsp").equals(req.getRequestURL())) {
			chain.doFilter(req, res);
		}
		
		if(user!=null) {
			chain.doFilter(req, res);
		}
		else {
			res.sendRedirect(req.getContextPath()+"/login.jsp");
		}
		
		
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
	}

	@Override
	public void destroy() {
		
	}

}
