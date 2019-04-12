package laobo.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
	public static void main(String[] args) {
//		Helloworld helloworld = new Helloworld();
//		helloworld.setName("laobo");
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Helloworld helloworld = (Helloworld) ctx.getBean("Helloworld");
		helloworld.hello();
	}
}
