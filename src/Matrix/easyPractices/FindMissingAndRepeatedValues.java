package Matrix.easyPractices;

import java.util.Arrays;
import java.util.HashSet;

public class FindMissingAndRepeatedValues {
    /*
    You are given a 0-indexed 2D integer matrix grid of size n * n with values in the range [1, n2].
    Each integer appears exactly once except a which appears twice and b which is missing. The task is to find
    the repeating and missing numbers a and b.

    Return a 0-indexed integer array ans of size 2 where ans[0] equals to a and ans[1] equals to b.


    Example 1:

    Input: grid = [[1,3],[2,2]]
    Output: [2,4]
    Explanation: Number 2 is repeated and number 4 is missing so the answer is [2,4].
    Example 2:

    Input: grid = [[9,1,7],[8,9,2],[3,4,6]]
    Output: [9,5]
    Explanation: Number 9 is repeated and number 5 is missing so the answer is [9,5].
     */
    public static int[] findMissingAndRepeatedValues(int[][] grid) {
        int a = 0;
        int b = findB(grid);
        int[] ans = new int[2];
        HashSet<Integer> hashSet = new HashSet<>();

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (hashSet.isEmpty())
                    hashSet.add(grid[i][j]);
                if (hashSet.contains(grid[i][j])) {
                    a = grid[i][j];
                    break;
                }
                else
                    hashSet.add(grid[i][j]);
            }
        }
        ans[0] = a;
        ans[1] = b;
        System.out.println(Arrays.toString(ans));
        return ans;
    }
    public static int findB(int[][] grid){
        int b = 1;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(b == grid[i][j]){
                    i = 0;
                    j = -1;
                    b++;
                }
            }
        }
        System.out.println(b);
        return b;
    }

    public static void main(String[] args) {
        int[][] grid = {
                {9,1,7},
                {8,9,2},
                {3,4,6}
        };
        int[][] grid1 = {
                {1,3},
                {2,2},
        };
        int[][] grid2 = {
                {2,1},
                {4,4},
        };
        findMissingAndRepeatedValues(grid2);
    }
}
