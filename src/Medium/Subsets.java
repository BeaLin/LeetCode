package Medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lby on 2017/4/21.
 * 78.Subsets
 */
public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        for(int i=0;i<=nums.length;i++)
            subsets(result,new ArrayList<Integer>(),nums,i,0);
        return result;
    }
    public void subsets(List<List<Integer>> result,List<Integer> temp,int[] nums,int k,int start){
        if(temp.size()==k){
            result.add(new ArrayList<>(temp));
            return;
        }
        for(int i=start;i<nums.length;i++){
            temp.add(nums[i]);
            subsets(result,temp,nums,k,i+1);
            temp.remove(temp.size()-1);
        }
    }

    public static void main(String[] args) {
        int[] nums=new int[]{1,2,3};
        List<List<Integer>> result=new Subsets().subsets(nums);
        for(List<Integer> re:result){
            for(Integer r:re)
                System.out.print(r+" ");
            System.out.println();
        }
    }
}
