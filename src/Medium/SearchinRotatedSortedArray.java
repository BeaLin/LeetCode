package Medium;

/**
 * Created by lby on 2017/5/2.
 * 33.Search in Rotated Sorted Array
 */
public class SearchinRotatedSortedArray {
    public int search(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target)
                return i;
        }
        return -1;
    }
}
