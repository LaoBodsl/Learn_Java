package laobo.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import laobo.dao.impl.UserDaoImpl;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");//设定编码
		response.setContentType("text/html;charset=utf-8");
		String UserName = request.getParameter("username");
		String password = request.getParameter("password");
//		System.out.println(UserName);
//		new UserDaoImpl().login();
		//2. 去访问dao ， 看看是否满足登录。
				UserDao dao = new UserDaoImpl();
				boolean isSuccess = dao.login(userName, password);
				
				//3. 针对dao的返回结果，做出响应
				if(isSuccess){
					//response.getWriter().write("登录成功.");
					
					//1. 查询出来所有的学生信息。
					StuDao stuDao = new StuDaoImpl();
					List<Student> list = stuDao.findAll();
					
					//2. 先把这个集合存到作用域中。
					request.getSession().setAttribute("list", list);
					
					//2. 重定向
					response.sendRedirect("stu_list.jsp");
					
				}else{
					response.getWriter().write("用户名或者密码错误！");
				}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
