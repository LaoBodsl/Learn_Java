package offer;

public class test {
	public void demo(int N) {
		
		if(N>0) {
			demo(N-1);
			System.out.println(N);
			demo(N-2);
			System.out.println(N);
		}
	}
	public static void main(String[] args) {
		test t = new test();
		t.demo(10);
	}
}
