package Easy;

/**
 * Created by lby on 2017/5/2.
 * 7.Reverse Integer
 */
public class ReverseInteger {
    public int reverse(int x) {
        int flag=1;
        if(x<0){
            flag=-1;
            x=Math.abs(x);
        }
        int num=0;
        while(x>0){
            int n=x%10;
            if(num>(Integer.MAX_VALUE-n)/10)
                return 0;
            x=x/10;
            num=num*10+n;
        }
        return num*flag;
    }

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(new ReverseInteger().reverse(-2147483412));
    }
}
