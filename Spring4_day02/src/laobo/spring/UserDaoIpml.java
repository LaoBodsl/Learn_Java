package laobo.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("userDao")
public class UserDaoIpml implements UserDao {
	@Value("zhansna")
	private String name;

	@Override
	public void save() {
		System.out.println("UserDao中save运行...."+name);
	}

}
