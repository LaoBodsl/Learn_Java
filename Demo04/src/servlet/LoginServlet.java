package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//1.获取数据
		String userName = request.getParameter("username");
		String passWord = request.getParameter("password");
		System.out.println("username="+userName);
		//2.校验数据
		PrintWriter pw = response.getWriter();
		if("admin".equals(userName)&&"123".equals(passWord))
		{
//			System.out.println("登录成功");
//			pw.write("login success..");
			response.setStatus(302);
			response.setHeader("Location", "login_success.html");
		}
		else {
//			System.out.println("登录失败");
			pw.write("login faile..");
			
		}
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
