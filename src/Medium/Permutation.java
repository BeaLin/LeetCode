package Medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lby on 2017/4/19.
 * 46.Permutation
 */
public class Permutation {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        backTracker(result,new ArrayList<>(),nums);
        return result;
    }
    private void backTracker(List<List<Integer>> result,List<Integer> tempList,int[] nums){
        if(tempList.size()==nums.length){
            result.add(new ArrayList<>(tempList));
        }
        else{
            for(int i=0;i<nums.length;i++){
                if(tempList.contains(nums[i])) continue;
                tempList.add(nums[i]);
                backTracker(result,tempList,nums);
                tempList.remove(tempList.size()-1);
            }
        }
    }
}
