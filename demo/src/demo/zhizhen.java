package demo;

import javax.swing.table.TableStringConverter;

public class zhizhen {
	public static void main(String[] args) {
		System.out.println(test()+"x");
	}
	private static int test() {
		int temp=1;
		try {
			System.out.println(temp+"y");
			return ++temp;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(temp);
			return ++temp;
		}
		finally {
			++temp;
			System.out.println(temp+"z");
		}
	}
}
