package EasyPractices;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicatesII {
    public int removeDuplicates(int[] nums) {

        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int num: nums){

            if(!list.contains(num)){
                count = 0;
                list.add(num);
            }else{
                count++;
                if(count == 1){
                    list.add(num);
                }
            }
        }
        for (int i = 0, j = list.size()-1; i < nums.length; i++){
            if(i > j){
                nums[i] = 0;
            }
            if(i < list.size()){
                nums[i] = list.get(i);
            }
        }
        System.out.println("NUMS "+ Arrays.toString(nums));
        System.out.println("ArrayList " + list);
        return list.size();
    }
}
