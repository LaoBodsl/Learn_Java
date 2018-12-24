package servlet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Demo03
 */
public class Demo03 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		test01();
//		test02();
		test03();
	}

	private void test03() {
		// TODO Auto-generated method stub
		try {
//			ServletContext context = getServletContext();
			Properties seef = new Properties();
			this.getClass().getClassLoader();
			InputStream is = ClassLoader.getSystemResourceAsStream("../../file/config.properties");
//			InputStream is  = context.getResourceAsStream("file/config.properties");
			seef.load(is);
			String name = seef.getProperty("name");
			System.out.println("name="+name);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void test02() {
		// TODO Auto-generated method stub
		try {
			ServletContext context = getServletContext();
			Properties seef = new Properties();
			InputStream is  = context.getResourceAsStream("file/config.properties");
			seef.load(is);
			String name = seef.getProperty("name");
			System.out.println("name="+name);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void test01() throws FileNotFoundException, IOException {
		ServletContext context = getServletContext();
		String path = context.getRealPath("file/config.properties");
		System.out.println("pathh="+path);
		Properties seef = new Properties();
		InputStream is  = new FileInputStream(file);
		seef.load(is);
		String name = seef.getProperty("name");
		System.out.println("name="+name);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
