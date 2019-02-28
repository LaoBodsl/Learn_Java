package laobo.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.digester.DocumentProperties.Charset;

import laobo.dao.StuDao;
import laobo.dao.UserDao;
import laobo.dao.domin.Student;
import laobo.dao.ipml.StuDaoImpl;
import laobo.dao.ipml.UserDaoIpml;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
//		System.out.println("username="+userName+"-->password"+password);
//		new UserDaoIpml().login();
		UserDao Dao = new UserDaoIpml();
		boolean isSuccess = Dao.login(userName, password);
		if(isSuccess) {
			StuDao stuDao = new StuDaoImpl();
			List<Student> list = stuDao.findAll();
			request.getSession().setAttribute("list", list);
//			response.getWriter().write("登录成功");
			response.sendRedirect("stu_list.jsp");
		}else {
			response.getWriter().write("登录失败");
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
