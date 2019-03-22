

public class MaxCut {
	 public static void main(String[] args) {
		for(int i=0;i<9;i++)
		{
			System.out.println(Cut(i));
		}
	 }

	private static int Cut(int length) {
		if(length<2)
			return 0;
		if(length==2)
			return 1;
		if(length==3)
			return 2;
		int [] ans = new int [length+1];
		ans[0]=0;
		ans[1]=1;
		ans[2]=2;
		ans[3]=3;
		int max=0;
		for(int i=4;i<=length;++i) {
			max=0;
			for(int j=1;j<=i/2;++j)
			{
				if(max<ans[j]*ans[i-j])
					max=ans[j]*ans[i-j];
				ans[i]=max;
			}
		}
		max = ans[length];
		return max;
	}
}
