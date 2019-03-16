package arr;

import java.util.Arrays;
import java.util.Scanner;

public class arr {
	public static void main(String[] args) {
	     /*
	      * 循环连续输入和输出
	      * 输入：一个数字 3
	      *     一个数组 1 2 3
	      */
	     Scanner x=new Scanner(System.in);
	     while(x.hasNext()){
	         int m=x.nextInt();
	         //System.out.println(m);
	         int[] number=new int[m];
	         for(int i=0;i<m;i++){
	             number[i]=x.nextInt();
	         }
	        // Arrays.sort(number);
	         System.out.println(Arrays.toString(number));
	     }
	    }
	}
	