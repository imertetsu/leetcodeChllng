package StringManipulation.EasyPractices;

public class PermutationDifferenceBetweenTwoStrings {
    /*
    You are given two strings s and t such that every character occurs at most once in s and t is a permutation of s.

    The permutation difference between s and t is defined as the sum of the absolute difference between the index
    of the occurrence of each character in s and the index of the occurrence of the same character in t.

    Return the permutation difference between s and t.

    Example 1:

    Input: s = "abc", t = "bac"

    Output: 2

    Explanation:

    For s = "abc" and t = "bac", the permutation difference of s and t is equal to the sum of:

    The absolute difference between the index of the occurrence of "a" in s and the index of the occurrence of "a" in t.
    The absolute difference between the index of the occurrence of "b" in s and the index of the occurrence of "b" in t.
    The absolute difference between the index of the occurrence of "c" in s and the index of the occurrence of "c" in t.
    That is, the permutation difference between s and t is equal to |0 - 1| + |2 - 2| + |1 - 0| = 2.
     */
    public static int findPermutationDifference(String s, String t) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            result += Math.abs(i - findEqualCharIndex(s.charAt(i), t));
        }
        return result;
    }
    private static int findEqualCharIndex(char s, String t){
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == s) {
                return i;
            }
        }
        return 0;
    }

    /*
    public int findPermutationDifference(String s, String t) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            result += Math.abs(i - t.indexOf(s.charAt(i)));
        }
        return result;
    }
     */

    public static void main(String[] args) {
        String s = "abcde";
        String t = "edbac";

        System.out.println(findPermutationDifference(s, t));;
    }
}
