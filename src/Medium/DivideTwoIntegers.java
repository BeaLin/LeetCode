package Medium;

/**
 * Created by lby on 2017/5/2.
 * 29.Divide Two Integers
 */
public class DivideTwoIntegers {
    public int divide(int dividend, int divisor) {
        int sign=1;
        if((dividend >0 && divisor<0)||(dividend<0 && divisor>0))
            sign=-1;
        long d1=Math.abs((long)dividend);
        long d2=Math.abs((long)divisor);
        if(d2==0) return Integer.MAX_VALUE;
        long result=ldivide(d1,d2);
        if(result>Integer.MAX_VALUE){
            return sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
        }else{
            return (int)(sign*result);
        }

    }
    private long ldivide(long d1, long d2) {
        if (d1 < d2) return 0;
        long sum = d2;
        long multiple = 1;
        while ((sum+sum) <= d1) {
            sum += sum;
            multiple += multiple;
        }
        return multiple + ldivide(d1 - sum, d2);
    }

    public static void main(String[] args) {
        System.out.println(new DivideTwoIntegers().divide(9,3));
    }
}
