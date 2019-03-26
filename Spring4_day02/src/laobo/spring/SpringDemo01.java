package laobo.spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo01 {
	@Test
	public void demo01(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDao userDao=(UserDao) applicationContext.getBean("userDao");
		userDao.save();
	}
	@Test
	public void demo02(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserServer userServer=(UserServer) applicationContext.getBean("userServer");
		userServer.save();
	}
}
