package com.itheima.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.itheima.dao.Studao;
import com.itheima.jdbc.util.JDBCUtil;

public class StudaoImpl implements Studao{

	@Override
	public void findAll() {
		Connection conn=null;
		Statement st = null;
		ResultSet rs = null;
		// TODO Auto-generated method stub
		try {
			conn = JDBCUtil.getConn();
			st = conn.createStatement();
			String sql = "select * from studet";
			rs = st.executeQuery(sql);
			while(rs.next()) {
				String name = rs.getString("name");
				System.out.println(name);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCUtil.release(conn, st, rs);
		}
	}

	
}
