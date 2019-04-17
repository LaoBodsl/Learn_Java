package laobo.spring.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class AspectLogging {
	@Before("execution(* laobo.spring.aop.*.*(int, int))")
	public void beforeMethod() {
		System.out.println("before method");
	}
	@After("execution(* laobo.spring.aop.*.*(int, int))")
	public void afterMethod() {
		System.out.println("after");
	}
}
