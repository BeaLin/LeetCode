package Easy;

/**
 * Created by lby on 2017/5/3.
 * 53.Maximum Subarray
 */
public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
//        int n=nums.length;
//        int max=Integer.MIN_VALUE;
//        for(int i=0;i<n;i++){
//            int sum=0;
//            for(int j=i;j<n;j++){
//                sum+=nums[j];
//                if(sum>max) max=sum;
//            }
//        }
//        return max;
        int maxSoFar=nums[0];
        int maxEndingHere=nums[0];
        for(int i=1;i<nums.length;++i){
            maxEndingHere=Math.max(maxEndingHere+nums[i],nums[i]);
            maxSoFar=Math.max(maxSoFar,maxEndingHere);
        }
        return maxSoFar;
    }
}
