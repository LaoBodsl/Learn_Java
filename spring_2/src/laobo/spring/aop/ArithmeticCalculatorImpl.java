package laobo.spring.aop;


import org.springframework.stereotype.Component;

@Component
public class ArithmeticCalculatorImpl implements ArithmeticCalculator {
	
	@Override
	public int add(int i, int j) {
		
		return i+j;
	}

	@Override
	public int div(int i, int j) {
		// TODO Auto-generated method stub
		return i/j;
	}

}
