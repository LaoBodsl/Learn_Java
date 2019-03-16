package laobo.Impl;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import laobo.util.JDBCUtil02;

import laobo.dao.UserDao;
import laobo.domain.UserBean;

public class UserDaoImpl implements UserDao {

	@Override
	public UserBean login(UserBean user) throws SQLException {
		QueryRunner runner=new QueryRunner(JDBCUtil02.getDataSource());
		String sql = "select * from stud where username=? and password=? ";
		return runner.query(sql, new BeanHandler<UserBean>(UserBean.class),user.getUsername(),user.getPassword());
		
	}

}
