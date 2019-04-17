package laobo.beans.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mian {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext ctx = new ClassPathXmlApplicationContext("auto_wire.xml");
		Person person = (Person) ctx.getBean("Person");
		System.out.println(person.toString());
		
	}
}
