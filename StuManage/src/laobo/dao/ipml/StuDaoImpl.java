package laobo.dao.ipml;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import laobo.dao.StuDao;
import laobo.dao.domin.Student;
import laobo.util.JDBCUtil;

public class StuDaoImpl implements StuDao {
	@Override
	public List<Student> findAll(){
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	List<Student> list = new ArrayList<Student>();
	try {
		conn = JDBCUtil.getConn();
		String sql = "select * from t_stu";
		ps = conn.prepareStatement(sql);
		rs = ps.executeQuery();
		
		while(rs.next()) {
			Student stu = new Student(); 
			stu.setId(rs.getInt("id"));
			stu.setName(rs.getString("name"));
			stu.setAge(rs.getInt("age"));
			stu.setAddress(rs.getString("address"));		
			list.add(stu);
		}
			
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		JDBCUtil.release(conn, ps, rs);
	}
	return list;
	}
}
