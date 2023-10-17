package EasyPractices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        int result = 0;
        Arrays.sort(nums);
        if(nums.length == 1){
            return nums[0];
        }
        for (int i = 0; i < nums.length; i = i + 2){
            if(i == nums.length -1){
                return nums[i];
            }
            if(nums[i] != nums[i+1]){
                return nums[i];
            }
        }
        return result;
    }
}
