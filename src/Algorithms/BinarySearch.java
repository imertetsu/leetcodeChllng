package Algorithms;

public class BinarySearch {

    public int binarySeachIndex(int[] array, int key){
        int lo = 0;
        int hi = array.length-1;
        int mid = -1;
        while(lo <=  hi){
            mid = lo + (hi - lo) / 2;
            if(key < array[mid])
                hi = mid-1;
            else if(key > array[mid])
                lo = mid +1;
            if (key == array[mid])
                return mid;
        }
        return -1;
    }
}
