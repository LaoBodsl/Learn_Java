package laobo.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("AppllicationContext.xml");
		ArithmeticCalculator arithmeticCalculator = (ArithmeticCalculator) ctx.getBean("arithmeticCalculator");
		int res = arithmeticCalculator.add(1, 2);
		System.out.println("add"+res);
		int res2 = arithmeticCalculator.div(6, 2);
		System.out.println("div"+res2);
	}
}
