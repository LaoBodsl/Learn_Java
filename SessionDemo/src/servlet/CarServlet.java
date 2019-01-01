package servlet;
import java.util.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class CarServlet
 */
public class CarServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		int id = Integer.parseInt(request.getParameter("id"));
		String[] names = {"iPhone7", "iPhone8","iPhone9","iPhone10"};
		String name = names[id];
		Map<String, Integer> map = (Map<String, Integer>)request.getSession().getAttribute("cart");
		if(map==null) {
			map = new LinkedHashMap<String,Integer>();
			request.getSession().setAttribute("cart", map);
		}
		if(map.containsKey(name))
		{
			map.put(name, map.get(name)+1);
		}
		else {
			map.put(name, 1);
		}
		response.getWriter().write("<a href = 'Product_list.jsp'><h3>继续购物</h3></a><br>");
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
