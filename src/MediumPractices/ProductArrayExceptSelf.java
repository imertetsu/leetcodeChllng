package MediumPractices;

import java.util.Arrays;

public class ProductArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefixProducts = new int[n];
        int[] suffixProducts = new int[n];
        int[] result = new int[n];

        int prefixProduct = 1;
        for (int i = 0; i < n; i++) {
            prefixProducts[i] = prefixProduct;
            prefixProduct *= nums[i];
        }
        int suffixProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            suffixProducts[i] = suffixProduct;
            suffixProduct *= nums[i];
        }
        for (int i = 0; i < n; i++) {
            result[i] = prefixProducts[i] * suffixProducts[i];
        }
        System.out.println(Arrays.toString(result));
        return result;
    }

}
