package Matrix.easyPractices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RatiosElements {
    /*
    Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero.
    Print the decimal value of each fraction on a new line with  places after the decimal.

    Note: This challenge introduces precision problems. The test cases are scaled to six decimal places,
    hough answers with absolute error of up to  are acceptable.

    Example
    arr = [1,1,0,-1,-1]
    There are  elements, two positive, two negative and one zero. Their ratios are ,  and . Results are printed as:

    0.400000
    0.400000
    0.200000
    */
    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int positives = 0;
        int negatives = 0;
        int zeros = 0;
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i) > 0)
                positives++;
            if(arr.get(i) < 0)
                negatives++;
            if(arr.get(i) == 0)
                zeros++;
        }

        System.out.println((double) positives / arr.size());
        System.out.println((double) negatives / arr.size());
        System.out.println((double) zeros / arr.size());

    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(-4,3,-9,0,4,1);
        plusMinus(list);
    }
}
