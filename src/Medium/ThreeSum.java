package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by lby on 2017/4/11.
 */
public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i==0 || (i>0 && nums[i]!=nums[i-1])){
                    int lo=i+1;
                    int hi=nums.length-1;
                    int sum=0-nums[i];
                    while(lo<hi){
                        if(nums[lo]+nums[hi]==sum){
                            result.add(Arrays.asList(nums[i],nums[lo],nums[hi]));
                            while(lo<hi && nums[lo]==nums[lo+1]) lo++;
                            while(lo<hi && nums[hi]==nums[hi-1]) hi--;
                            lo++;
                            hi--;
                        }else if(nums[lo]+nums[hi] <sum) lo++;
                        else hi--;
                    }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] s=new int[]{0,0,0,0};
        List<List<Integer>> result=threeSum(s);
        for(List<Integer> temp:result){
            for (Integer tt:temp)
                System.out.print(tt+" ");
            System.out.println();
        }
    }
}
