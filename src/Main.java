import EasyPractices.MergeArrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        MergeArrays mergeArrays = new MergeArrays();
        mergeArrays.merge(nums1, 3, nums2, 3);
    }
}