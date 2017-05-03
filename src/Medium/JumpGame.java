package Medium;

/**
 * Created by lby on 2017/5/3.
 */
public class JumpGame {
    public boolean canJump(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;++i){
            if(i>max) return false;
            max=Math.max(max,nums[i]+i);
        }
        return true;
    }
}
