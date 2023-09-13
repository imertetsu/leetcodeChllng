package EasyPractices;

import java.util.ArrayList;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int listSize = nums.length;
        int majorElement = 0;
        System.out.println(listSize/2);

        for (int num: nums){
            if(!list.contains(num)){
                list.add(num);
            }
        }
        for (int i = 0; i < list.size(); i++){
            int numberTimes = findNTimesNumber(nums, list.get(i));
            if(numberTimes > listSize/2){
                majorElement = list.get(i);
            }
        }
        System.out.println(list);
        System.out.println(majorElement);
        return majorElement;
    }

    public int findNTimesNumber(int[] array, int num){
        int count = 0;
        for (int i = 0; i< array.length; i++){
            if(num == array[i]){
                count++;
            }
        }
        return count;
    }
}
