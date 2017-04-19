package Easy;

/**
 * Created by lby on 2017/4/19.
 * 27.Remove Element
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
//        if(nums.length==0) return 0;
//        int i=0;
//        int j=nums.length-1;
//        while(i<j){
//            if(nums[i]==val){
//                while(nums[j]==val ) j--;
//                if(i<j){
//                    int temp=nums[i];
//                    nums[i]=nums[j];
//                    nums[j]=temp;
//                    i++;j--;
//                }
//            }else{
//                i++;
//            }
//
//        }
//        if(nums[i]==val) return i;
//        else  return i+1;
        int m=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[m]=nums[i];
                m++;
            }
        }
        return m;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{3,3};
        int val=3;
        int length=new RemoveElement().removeElement(nums,val);
        for(int i=0;i<length;i++){
            System.out.println(nums[i]);
        }
    }
}
