import EasyPractices.BestTimeToBuyAndSellStock;
import EasyPractices.Recursividad;
import MediumPractices.BestTimeToBuyAndSellStockII;
import MediumPractices.JumpGame;

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
        /*RemoveDuplicatesII removeDuplicates2 = new RemoveDuplicatesII();
        int[] duplicates2 = {1,2};
        removeDuplicates2.removeDuplicates(duplicates2);
        //----------------------------------------------------
        MajorityElement majorityElement = new MajorityElement();
        int[] elements = {2,2,1,1,1,2,2};
        majorityElement.majorityElement(elements);
        //----------------------------------------------------
        RotateArray rotateArray = new RotateArray();
        int[] arrayToRotate = {1,2,3,4,5,6,7};
        rotateArray.rotate(arrayToRotate, 12);*/

        //----------------------------------------------------
        BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();
        int[] pricesArray = {7,1,5,3,6,4};
        bestTimeToBuyAndSellStock.maxProfit(pricesArray);

        Recursividad factorial = new Recursividad();
        System.out.println(factorial.fibonacciFrom(8));

        BestTimeToBuyAndSellStockII bestTimeToBuyAndSellStockII = new BestTimeToBuyAndSellStockII();
        int[] pricesA = {6,5,4,3,2,1};

        int[] tricky2 = {2,4,1};
        System.out.println(bestTimeToBuyAndSellStockII.maxProfit(tricky2));

        JumpGame jumpGame = new JumpGame();
        int[] tricky = {1,2,3};
        System.out.println("Bool"+ jumpGame.canJump(tricky));
    }
}