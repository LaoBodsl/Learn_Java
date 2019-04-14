package simple;

public class Simple {
	public static void main(String[] args) {
		int arr[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{1,2,2,3}};
		int i,j,t,max,flag,n=0;
		for(i=0;i<4;i++) {
			t=arr[i][0];
			max=0;
			for(j=0;j<4;j++) {
				if(arr[i][j]>t) {
					t=arr[i][j];
					max=j;
				}
			}
			t=arr[i][max];
			flag=1;
			for(j=0;j<4;j++) {
				if(arr[j][max]<t) {
					flag=0;
					break;
				}
			}
			if(flag==1) {
				System.out.println(arr[i][max]);
				n++;
			}
		}
		if(n==0) {
			System.out.println("no");
		}
		
	}
}
