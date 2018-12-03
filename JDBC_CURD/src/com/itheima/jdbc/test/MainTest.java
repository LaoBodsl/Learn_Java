package com.itheima.jdbc.test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.itheima.jdbc.util.JDBCUtil;

public class MainTest {
	public static void main(String[] args) {
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		//查询
		//1.获取连接对象
		try {
			conn = JDBCUtil.getConn();
			
			st = conn.createStatement();
			String sql = "SELECT * from studet";
			rs = st.executeQuery(sql);
			while(rs.next()) {
				String name = rs.getString("name");
				int age = rs.getInt("age");
				System.out.println(name+"  "+age);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCUtil.release(conn, st, rs);
		}
	}
}
