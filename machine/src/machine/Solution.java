package machine;

public class Solution {
	public static void main(String[] args) {
		System.out.println(movingCount(5,10,10));
	}
	public static int movingCount(int threshold, int rows, int cols)
    {
        if(threshold<0||rows<=0||cols<=0)
            return 0;
        boolean [] visit = new boolean [rows*cols]; 
        for(int i=0;i<rows*cols;i++)
        {
            visit[i]=true;
        }
         return MovingCount(threshold,rows,cols,0,0,visit);
       
    }
    private static int MovingCount(int threshold,int rows,int cols,int row,int col,boolean[] visit){
        int count=0;
        if(check(threshold,rows,cols,row,col,visit))
        {
            visit[row*cols+col]=false;
            count = 1+MovingCount(threshold,rows,cols,row-1,col,visit)+
                MovingCount(threshold,rows,cols,row,col+1,visit)+
                MovingCount(threshold,rows,cols,row,col-1,visit)+
                MovingCount(threshold,rows,cols,row+1,col,visit);
        }
        return count;
    }
    private static boolean check(int threshold,int rows,int cols,int row,int col,boolean [] visit){
        if(row>0&&row<rows&&col>0&&col<cols&&visit[row*cols+col]&&getDigitsSum(row)+getDigitsSum(col)<=threshold)
            return true;
        return false;
    }
    private static int getDigitsSum(int num){
        int sum=0;
        while(num>0){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
}
