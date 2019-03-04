package laobo;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.junit.Test;

public class TestPool {
	
	public void testPool() {
		MyDataSource dataSource = new MyDataSource();
		Connection conn=null;
		PreparedStatement ps=null;
		try {	
			conn = dataSource.getConnection();
			String sql = "select * from t_stu";
			ps = conn.prepareStatement(sql);
			ps.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				ps.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			dataSource.addBack(conn);
		} 
		
	}
	
}
