package laobo;

public class isNumber {
	private static int index=0;
    public static boolean isNumeric(char[] str) {
        
        if(str==null)
            return false;
        boolean flag = isInterge(str);
        if(index<str.length&&str[index]=='.'){
            index+=1;
            flag=isUInterge(str)||flag;
        }
        if(index<str.length&&(str[index]=='e'||str[index]=='E')){
            index+=1;
            flag=flag&&isInterge(str);
        }
     flag=flag&&index<str.length;
     return flag;
   }
       private static boolean isInterge(char[] str){
            if(index<str.length&&(str[index]=='-'||str[index]=='+'))
            {
                index+=1;
            }
            return isUInterge(str);
        }
        private static boolean isUInterge(char[] str){
            int index1=index;
            while(index<str.length&&str[index]>='0'&&str[index]<='9')
            {
                index+=1;
            }
            return index>index1;
        }
        
        public static void main(String[] args) {
        	char[] str = {'1','0','0'};
        	System.out.println(isNumeric(str));
        }
}
