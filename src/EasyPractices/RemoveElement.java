package EasyPractices;

import java.util.*;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++){
            if(nums[i] == val){
                nums[i] = 2147483647;
            }else {
                list.add(nums[i]);
            }
        }
        Arrays.sort(nums);
        System.out.println("Arraylist "+list);
        nums = new int[list.size()];
        for (int i = 0; i < nums.length; i++){
            nums[i] = list.get(i);
        }



        System.out.println("NUMS: "+ Arrays.toString(nums));

        return nums.length;
    }
}
