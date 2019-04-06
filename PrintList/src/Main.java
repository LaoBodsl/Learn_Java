import java.util.ArrayList;
public class Main {
    public static ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(matrix==null)
            return list;
        int rows=matrix.length;
        int cols=matrix[0].length;
        int start=0;
        while(cols>start*2&&rows>start*2){
            PrintOneCircle(matrix,cols,rows,start,list);
            ++start;
        }
       return list;
    }
    private static void PrintOneCircle(int [][] matrix,int cols,int rows,int start,ArrayList<Integer> list){
        int endX = cols-start-1;
        int endY = rows-start-1;
        for(int i=start;i<=endX;i++){
            list.add(matrix[start][i]);
        }
        if(start<endY){
            for(int i=start+1;i<=endY;i++)
                list.add(matrix[i][endX]);
        }
        if(start<endX&&start<endY){
            for(int i=endX-1;i>=start;i--)
                list.add(matrix[endY][i]);
        }
        if(start<endX&&start<endY-1){
            for(int i=endY-1;i>=start+1;--i){
                list.add(matrix[i][start]);
            }
        }
    }
    public static void main(String[] args){
//        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
//    	int[][] matrix = null;
    	int[][] matrix= {{1}};
        ArrayList<Integer>list=printMatrix(matrix);
        for (Integer tmp : list) {
            System.out.println(tmp);
        }
    }
}