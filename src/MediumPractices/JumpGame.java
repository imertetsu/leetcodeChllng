package MediumPractices;

import java.util.ArrayList;
import java.util.List;

public class JumpGame {
    public boolean canJump(int[] nums) {

        if (nums.length == 1){
            return true;
        }

        int max = 0;
        for(int i = 0; i < nums.length - 1 && max >= i; i++){
            if (max < i + nums[i]){
                max = i + nums[i];
            }
            if (max >= nums.length -1){
                return true;
            }
        }
        return false;
    }
}
