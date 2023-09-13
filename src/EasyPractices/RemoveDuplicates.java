package EasyPractices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int num: nums){
            if(list.isEmpty()){
                list.add(num);
            }
            if(!list.contains(num)){
                list.add(num);
            }
        }
        for (int i = 0; i < list.size(); i++){
            nums[i] = list.get(i);
        }
        System.out.println("NUMS " + Arrays.toString(nums));
        nums = new int[list.size()];
        System.out.println("NUMS " + Arrays.toString(nums));
        System.out.println("Arraylist"+ list);
        return list.size();
    }
}
