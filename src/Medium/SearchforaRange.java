package Medium;

/**
 * Created by lby on 2017/5/2.
 * 34.Search for a Range
 */
public class SearchforaRange {
    public int[] searchRange(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                int i=mid;
                int j=mid;
                while(i>=0 && nums[i]==target) i--;
                while(j<nums.length && nums[j]==target) j++;
                return new int[]{i+1,j-1};
            }else if(nums[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return new int[]{-1,-1};
    }
}
