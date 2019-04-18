package findOneNum;

public class Main {
	public static void main(String[] args) {
		int index=1001;
		System.out.println(digitAtIndex(index));
	}

	private static int digitAtIndex(int index) {
		// TODO Auto-generated method stub
		if(index<0)
			return -1;
		int digits=1;
		while(true) {
			int digitNumbers = countOfNumber(digits);
			int countOfNum = digitNumbers*digits;
			if(index<countOfNum) {
				return digitAtIndex(index,digits);
			}
			else {
				index-=countOfNum;
				digits++;
			}
		}
	}

	private static int digitAtIndex(int index, int digits) {
		// TODO Auto-generated method stub
		int Number = beginNumber(digits)+index/digits;
		int IndexFormRight = digits-index%digits;
		for(int i=1;i<IndexFormRight;i++) {
			Number/=10;
		}
		return Number%10;
	}

	private static int beginNumber(int digits) {
		// TODO Auto-generated method stub
		if(digits==1)
			return 0;
		return (int)Math.pow(10, digits-1);
	}

	private static int countOfNumber(int digits) {
		// TODO Auto-generated method stub
		if(digits==1)
			return 10;
		int count=(int) Math.pow(10, digits-1);
		return 9*count;
	}
}
