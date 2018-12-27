package servlet;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Demo01
 */
public class Demo01 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.获取下载的文件名
		String fileName = request.getParameter("filename");
		//1.获取地址
		String path = getServletContext().getRealPath("download/"+fileName);
		InputStream is = new FileInputStream(path);
		OutputStream os = response.getOutputStream();
		int len=0;
		byte[]buffer = new byte[1024];
		while ((len=is.read(buffer))!=-1) {
			os.write(buffer,0,len);	
		}
		os.close();
		is.close();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
