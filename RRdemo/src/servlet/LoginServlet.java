package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		String userName = request.getParameter("username");
		String passWord = request.getParameter("password");
		
		if("admin".equals(userName)&&"123".equals(passWord)) {
			//1.重定向
//			response.getWriter().write("success");
//			response.sendRedirect("login_success.html");
			//2.转发
			request.getRequestDispatcher("login_success.html").forward(request, response);
			
		}
		else {
			response.getWriter().write("fail");
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
