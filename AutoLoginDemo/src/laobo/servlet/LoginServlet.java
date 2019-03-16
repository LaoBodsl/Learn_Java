package laobo.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import laobo.Impl.UserDaoImpl;
import laobo.dao.UserDao;
import laobo.domain.UserBean;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			String userName = request.getParameter("username");
			String passWord = request.getParameter("password");
//			String autoLogin = request.getParameter("auto_login");
			UserBean user = new UserBean();
			user.setUsername(userName);
			user.setPassword(passWord);
			UserDao dao = new UserDaoImpl();
			UserBean userBean = dao.login(user);
			if(userBean!=null) {
				request.getSession().setAttribute("userBena", userBean); 
				response.sendRedirect("index.jsp");
			}
			else {
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		System.out.println(userName+"="+passWord);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
