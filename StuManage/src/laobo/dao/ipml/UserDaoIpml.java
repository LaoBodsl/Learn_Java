package laobo.dao.ipml;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import laobo.dao.UserDao;
import laobo.util.JDBCUtil;

public class UserDaoIpml implements UserDao {

	@Override
	public boolean login(String userName, String password) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = JDBCUtil.getConn();
			String sql = "select * from t_user where username=? and password=?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, userName);
			ps.setString(2, password);
			rs = ps.executeQuery();
			return rs.next();
//			System.out.println("数据库连接状态:"+conn.isClosed());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCUtil.release(conn, ps, rs);
		}
		return false;
	}

}
