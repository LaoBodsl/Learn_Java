package laobo.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import laobo.dao.UserDao;
import laobo.util.JDBCUtil;

public class UserDaoImpl implements UserDao {

	@Override
	public boolean login() {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs   = null;
		try {
			 conn = JDBCUtil.getConn();
			 String sql = "select * from t_user where username=? and password=?";
				
				//2. 创建ps对象
				ps = conn.prepareStatement(sql);
				ps.setString(1, userName);
				ps.setString(2, password);
				
				
				//3. 开始执行。
				rs = ps.executeQuery();
				
				//如果能够成功移到下一条记录，那么表明有这个用户。 
				return rs.next();
//			System.out.println(conn.isClosed());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			JDBCUtil.release(conn, ps, rs);
		}
		return false;
	}

}
