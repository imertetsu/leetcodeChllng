package EasyPractices;

import java.util.Arrays;

public class MergeArrays {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1.length == m + n){
            for (int i = 0; i < nums2.length; i++){
                nums1[n+i] = nums2[i];
            }
            System.out.println(Arrays.toString(nums1));
        }
    }
}
