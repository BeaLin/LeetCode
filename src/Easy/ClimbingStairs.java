package Easy;

/**
 * Created by lby on 2017/4/17.
 * 70.Climbing Stairs
 */
public class ClimbingStairs {
    public int climbStairs(int n) {
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        if(n==2)
            return 2;
        int oneStep=1;
        int twoStep=2;
        int allWays=0;
        for(int i=2;i<n;i++){
            allWays=oneStep+twoStep;
            oneStep=twoStep;
            twoStep=allWays;
        }
        return allWays;
    }

    public static void main(String[] args) {
        System.out.println(new ClimbingStairs().climbStairs(44));
    }
}
