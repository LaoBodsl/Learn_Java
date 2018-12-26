package servlet;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.xalan.internal.utils.XMLSecurityManager.NameMap;

/**
 * Servlet implementation class Demo01
 */
public class Demo01 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.得到一个枚举集合
		Enumeration<String> headerNames = request.getHeaderNames();
	
		while(headerNames.hasMoreElements()) {
			String name = (String) headerNames.nextElement();
			System.out.println("name="+name);
		}
		//2.获取的是客户端提交上来的数据
		String name = request.getParameter("name");
		System.out.println("name="+name);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
