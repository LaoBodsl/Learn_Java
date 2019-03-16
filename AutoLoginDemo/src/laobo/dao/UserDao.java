package laobo.dao;

import java.sql.SQLException;

import laobo.domain.UserBean;

public interface UserDao {
	UserBean login(UserBean user)throws SQLException;
}
