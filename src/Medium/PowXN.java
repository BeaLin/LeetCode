package Medium;

/**
 * Created by lby on 2017/5/3.
 * 50.Pow(x, n)
 */
public class PowXN {
    public double myPow(double x, int n) {
        if(x==Double.POSITIVE_INFINITY) return 0.0;
        if(n==0) return 1;
        if(n<0){
            n=-n;
            x=1/x;
        }
        return n%2==0? myPow(x*x,n/2):x*myPow(x*x,n/2);
    }


    public static void main(String[] args) {
        System.out.println(Math.pow(2.00000,-2147483648));
        System.out.println(new PowXN().myPow(2.00000,-2147483648));
    }

}
