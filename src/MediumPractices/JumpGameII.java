package MediumPractices;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class JumpGameII {
    public int jump(int[] nums) {

        int n = nums.length;
        int jumps = 0;
        int currentEnd = 0;
        int farthest = 0;

        for (int i = 0; i < n - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);

            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;

                if (currentEnd >= n - 1) {
                    break;
                }
            }
        }
        return jumps;

    }
}
/*

 */