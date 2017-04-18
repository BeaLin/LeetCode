package Easy;

import java.util.Arrays;

/**
 * Created by lby on 2017/4/17.
 * 88.MergeSortedArray
 */
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        while(i>-1 && j>-1){
            nums1[k--]=(nums1[i]>nums2[j])?nums1[i--]:nums2[j--];
        }
        while(j>-1){
            nums1[k--]=nums2[j--];
        }

    }
}
