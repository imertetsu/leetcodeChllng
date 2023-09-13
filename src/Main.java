import EasyPractices.MergeArrays;
import EasyPractices.RemoveDuplicates;
import EasyPractices.RemoveDuplicatesII;
import EasyPractices.RemoveElement;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        /*int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};

        int[] nums3 = {};
        int[] nums4 = {1};
        MergeArrays mergeArrays = new MergeArrays();
        MergeArrays mergeArrays2 = new MergeArrays();

        mergeArrays.merge(nums1, 3, nums2, 3);
        mergeArrays2.merge(nums3, 0, nums4, 1);*/
        //-------------------------------------------

        /*RemoveElement removeElement = new RemoveElement();
        int[] nums = {0,1,2,2,3,0,4,2};
        removeElement.removeElement(nums, 2);*/
        //--------------------------------------------------
        /*RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int[] duplicates = {0,0,1,1,1,2,2,3,3,4};
        removeDuplicates.removeDuplicates(duplicates);*/
        //----------------------------------------------------
        RemoveDuplicatesII removeDuplicates2 = new RemoveDuplicatesII();
        int[] duplicates2 = {1,2};
        removeDuplicates2.removeDuplicates(duplicates2);
    }
}