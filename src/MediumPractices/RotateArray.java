package MediumPractices;

import java.util.ArrayList;
import java.util.Arrays;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Para manejar casos donde k > n

        // Primero, revertimos el arreglo
        reverse(nums, 0, n - 1);

        // Luego, revertimos las primeras k elementos
        reverse(nums, 0, k - 1);

        // Finalmente, revertimos los elementos restantes
        reverse(nums, k, n - 1);
        System.out.println(Arrays.toString(nums));
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        /*int[] copyNums = new int[nums.length];
        if(k > nums.length){
            k = k % nums.length;
        }
        while(k > 0 ){
            int lastNumber = nums[nums.length-1];
            copyNums[0] = lastNumber;
            for(int i = 1; i < nums.length; i++){
                copyNums[i] = nums[i-1];
            }
            for(int i = 0; i < nums.length; i++){
                nums[i] = copyNums[i];
            }
            System.out.println(Arrays.toString(copyNums));
            k--;
        }*/
    }

}
