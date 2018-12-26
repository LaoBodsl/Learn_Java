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
			//1.成功次数累加
			//获取以前存的值,然后在旧的值基础上+1
			Object obj = getServletContext().getAttribute("count");
			int totalCount = 0;
			if(obj!=null)
			{
				totalCount = (int)obj;
			}
			System.out.println("登录成功的次数是:"+totalCount);
			//给这个count赋新的值
			getServletContext().setAttribute("count", totalCount+1);
			//2.跳转到成功界面
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
