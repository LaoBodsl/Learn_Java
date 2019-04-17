package laobo.spring.aop;


import java.util.ArrayList;
import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectLogging {
	@Before("execution(* laobo.spring.aop.ArithmeticCalculator.* (..))")
	public void BeforeMethod(JoinPoint joinpoint) {
		String methodName = joinpoint.getSignature().getName();
		Object[] args = joinpoint.getArgs();
		System.out.println(methodName+"Before......"+Arrays.asList(args));
	}
}
