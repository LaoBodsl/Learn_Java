package candy;

import java.util.Arrays;
import java.util.Scanner;

public class candy {
	public static void main(String[] args) {
	     Scanner x =new Scanner(System.in);
	     while(x.hasNext()){
	         int m=x.nextInt();
	         //System.out.println(m);
	         int[] number=new int[m];
	         for(int i=0;i<m;i++){
	             number[i]=x.nextInt();
	         }
	         int answer = candy(number);
	         System.out.println(answer);
	}
}
public static int candy(int[] ratings) {
		// TODO Auto-generated method stub
        int[] dp = new int[ratings.length];
        dp[0] = 1;
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i - 1]) {
                dp[i] = dp[i - 1] + 1;
            } else {
                dp[i] = 1;
            }
        }
        int[] dp2 = new int[ratings.length];
        dp2[dp2.length - 1] = 1;
        for (int i = dp2.length - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                dp2[i] = dp2[i + 1] + 1;
            } else {
                dp2[i] = 1;
            }
        }
        int result = 0;
        for (int i = 0; i < dp.length; i++) {
            result += Math.max(dp[i], dp2[i]);
        }
        return result;
    }
}


