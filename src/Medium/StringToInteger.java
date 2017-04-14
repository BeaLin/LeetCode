package Medium;

/**
 * Created by lby on 2017/4/11.
 * 8.String To Integer
 */
public class StringToInteger {
    public static int myAtoi(String str){
        if(str.length()==0)
            return 0;
        int index=0;
        while(index<str.length() && str.charAt(index)==' ' && index <str.length()) index++;
        int sign=1;
        if(str.charAt(index) == '+' || str.charAt(index)=='-'){
            sign = str.charAt(index)=='+'?1:-1;
            index++;
        }
        if(index>=str.length())
            return 0;
        if(str.charAt(index) == '+' || str.charAt(index)=='-')
            return 0;
        int total=0;
        while(index<str.length()){
            int digit=str.charAt(index)-'0';
            if(digit<0 || digit >9) break;
            if (total> Integer.MAX_VALUE/10 || total==Integer.MAX_VALUE/10 && Integer.MAX_VALUE%10 <digit)
                return sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
            total = 10*total+digit;
            index ++;
        }
        return total*sign;
    }

    public static void main(String[] args) {
        String a="+";
        System.out.println(myAtoi(a));

    }
}
