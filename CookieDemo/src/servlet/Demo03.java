package servlet;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.crypto.Data;

import util.CookieUtil;

/**
 * Servlet implementation class Demo03
 */
public class Demo03 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		String userName = request.getParameter("username");
		String passWord = request.getParameter("password");
		if("admin".equals(userName)&&"123".equals(passWord)) {
			//1.获取cookie last-name
			Cookie[] cookies = request.getCookies();
			//2.从数组中找到我们想要的cookie
			Cookie cookie = CookieUtil.findCookie(cookies,"last");
			if(cookies==null) {
				Cookie C = new Cookie("last", System.currentTimeMillis()+"");
				C.setMaxAge(60*60);
				response.addCookie(C);
				response.getWriter().write("欢迎您."+userName);
			}
			else {
				//1.获取以前的cookie
				long lastVisitTime = Long.parseLong(cookie.getValue());
				//2.输出到界面
				response.getWriter().write("欢迎您,"+userName+",您上一次登录的时间为:"+lastVisitTime);
				//3.重置登录时间
				cookie.setValue(System.currentTimeMillis()+"");
				response.addCookie(cookie);
			}
		}
		else {
			response.getWriter().write("fail...");
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub		
		doGet(request, response);
	}

}