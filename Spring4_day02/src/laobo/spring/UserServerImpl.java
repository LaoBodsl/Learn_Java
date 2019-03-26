package laobo.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("userServer")
public class UserServerImpl implements UserServer {
	@Autowired
	private UserDao userDao;
	
	@Override
	public void save() {
		System.out.println("server运行");
		userDao.save();
		// TODO Auto-generated method stub

	}

}
