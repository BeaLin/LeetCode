package Easy;

/**
 * Created by lby on 2017/5/2.
 * 26.Remove Duplicates from Sorted Array
 */
public class RemoveDuplicatesfromSortedArray {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0 || nums.length==1) return nums.length;
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[count++]=nums[i];
            }
        }
        return count;
    }
}
