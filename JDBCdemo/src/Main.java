import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Main {
	public static void main(String[] args) throws ClassNotFoundException
	{
		
		try {
			//注册驱动c
			Class.forName("com.mysql.cj.jdbc.Driver");
//			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			//建立连接
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/stu", "root", "12345678");
			//穿建
			Statement st = conn.createStatement();
			String sql = "select * from studet";
			ResultSet rs = st.executeQuery(sql);  
			while(rs.next()) {
				int id = rs.getInt("id");
				 String name = rs.getString("name");
//				String  name = 
				int age  = rs.getInt("age");
				System.out.println("id="+id+"=name="+name+"=age="+age);				
			}
			rs.close();
			st.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
}
