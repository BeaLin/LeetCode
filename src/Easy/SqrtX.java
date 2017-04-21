package Easy;

/**
 * Created by lby on 2017/4/19.
 * 69.Sqrt(x)
 */
public class SqrtX {
    public int mySqrt(int x) {
        long r=x;
        while(r*r>x){
            r=(r+x/r)/2;
        }
        return (int)(r);
    }
}
