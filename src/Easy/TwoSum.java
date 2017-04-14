package Easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lby on 2017/4/11.
 * 1.Two Sum
 */
public class TwoSum {
    //method1
    public int[] twoSum(int[] nums,int target){
        int[] result =new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int sum=nums[i]+nums[j];
                if(sum==target){
                    result[0]=i;
                    result[1]=j;
                    return result;
                }
            }
        }
        return result;
    }
    //method2
    public int[] twoSum2(int[] nums,int target){
        int[] result =new int[2];
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                result[1]=i;
                result[0]=map.get(target-nums[i]);
                return result;
            }
            map.put(nums[i],i);
        }
        return result;
    }

    public static void main(String[] args) {
        TwoSum twoSum=new TwoSum();
        int[] nums=new int[]{3,2,4};
        int target=6;
        int[] result=twoSum.twoSum2(nums,target);
        for(int i=0;i<result.length;i++)
            System.out.println(result[i]);
    }
}
