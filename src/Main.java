import Algorithms.BinarySearch;
import EasyPractices.BestTimeToBuyAndSellStock;
import EasyPractices.Recursividad;
import EasyPractices.RomanToInt;
import EasyPractices.SingleNumber;
import HardPractices.Candy;
import Matrix.MinFillingPathSum;
import MediumPractices.*;

import java.util.LinkedList;

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
        /*BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();
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

        JumpGameII jumpGameII = new JumpGameII();
        int[] arr = {3,2,1};
        System.out.println("JUMPS "+ jumpGameII.jump(arr));*/

        /*HIndex hIndex = new HIndex();
        int[] arr = {3,1,1};
        System.out.println(hIndex.hIndex(arr));

        InsertDeleteGetRandomO1 insertDeleteGetRandomO1 = new InsertDeleteGetRandomO1();
        insertDeleteGetRandomO1.insert(1);
        insertDeleteGetRandomO1.remove(2);
        insertDeleteGetRandomO1.insert(2);
        insertDeleteGetRandomO1.getRandom();
        insertDeleteGetRandomO1.remove(1);
        insertDeleteGetRandomO1.insert(2);
        insertDeleteGetRandomO1.getRandom();*/
        /*ProductArrayExceptSelf productArrayExceptSelf =  new ProductArrayExceptSelf();
        int[] arr = {-1,2,3,4};
        productArrayExceptSelf.productExceptSelf(arr);*/
        /*GasStation gasStation = new GasStation();
        int[] gast = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};
        gasStation.canCompleteCircuit(gast, cost);*/

        /*Candy candy = new Candy();
        int[] rating = {1,3,2,2,1};
        candy.candy(rating);*/
        SingleNumber singleNumber = new SingleNumber();
        int[] single = {4,1,2,1,2};
        singleNumber.singleNumber(single);

        BinarySearch binarySearch = new BinarySearch();
        int[] array = {6,13,14,25,33,43,51,53,64,72,84,93,95,97,99};
        System.out.println(binarySearch.binarySeachIndex(array, 53));

        OrderLikeDictionary orderLikeDictionary = new OrderLikeDictionary();
        String[] palabras = {"cono", "conocer", };
        System.out.println(orderLikeDictionary.isOrdered(palabras));

//        MinFillingPathSum minFillingPathSum = new MinFillingPathSum();
//        int[][] matrix = {{2,1,3},{6,5,4}};
//        minFillingPathSum.minFallingPathSum(matrix);
        RomanToInt romanToInt = new RomanToInt();
        System.out.println(romanToInt.romanToInt("D"));

//        LinkedListAddTwoNumbers linkedListAddTwoNumbers = new LinkedListAddTwoNumbers();
//
//        ListNode ln = new ListNode(2, new ListNode(4, new ListNode(3)));
//        ListNode ln2 = new ListNode(5, new ListNode(6, new ListNode(4)));
//        System.out.println(ln.val);
//        System.out.println(ln.next.val);
//        System.out.println(ln.next.next.val);
//        System.out.println(ln.next.next.next);
//
//        linkedListAddTwoNumbers.addTwoNumbers(ln,ln2);

        TaskScheduler taskScheduler = new TaskScheduler();
        char[] tasks = {'A','A','C','B','B','A','C'};
        char[] tasks1 = {'A','A','A','A','A','A','B','C','D','E','F','G'};
        char[] tasks2 = {'A','A'};
        char[] tasks3 = {'A','A','B','B','A','B'};
        char[] tasks4 = {'A','B','C'};
        System.out.println(taskScheduler.leastInterval(tasks3, 50));
    }
}