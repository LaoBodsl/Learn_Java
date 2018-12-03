package com.itheima.jdbc.test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

import com.itheima.jdbc.util.JDBCUtil;

//单元测试
public class TestDemo {
	@Test
	public void testQuery() {
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
	@Test
	public void testInsert() {
		//查询
		Connection conn = null;
		Statement st = null;
		//ResultSet rs = null;	
		try {
			conn = JDBCUtil.getConn();
			st = conn.createStatement();
			String sql = "insert into studet value (4,'avv',45)";
			int result = st.executeUpdate(sql);
			if(result>0) {
				System.out.println("添加成功");
			}
			else {
				System.out.println("添加失败");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCUtil.release(conn, st);
		}
	}
	@Test
	public void testDelete() {
		//查询
		Connection conn = null;
		Statement st = null;
		//ResultSet rs = null;	
		try {
			conn = JDBCUtil.getConn();
			st = conn.createStatement();
			String sql = "delete from studet where name='avv'";
			int result = st.executeUpdate(sql);
			if(result>0) {
				System.out.println("删除成功");
			}
			else {
				System.out.println("删除失败");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCUtil.release(conn, st);
		}
	}
}
