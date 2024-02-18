package MediumPractices;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TaskScheduler {
    public int leastInterval(char[] tasks, int n) {
        int halfSizeArray = tasks.length / 2;
        int[] charCount = new int[2];
        boolean isDoubleHalf = false;

        ArrayList<Character> chars = new ArrayList<>();
        ArrayList<Integer> countChars = new ArrayList<>();
        chars.add(tasks[0]);

        Map<Character, Integer> charsC = new HashMap<>();

        int count = 1;
        int result = tasks.length;



            for (int k = 1; k < tasks.length && n!=0; k++){
                if(!chars.contains(tasks[k])){
                    chars.add(tasks[k]);
                }
                for (int i = 1; i-1 < tasks.length-1; i++) {

                    if(chars.contains()) {
                        count = count + 1;
                    }
                }
                countChars.add(count);
                count = 1;
            }
        return result;
    }
}


//for (int i = 1, k = 0; i-1 < tasks.length-1 && n!=0; i++){
//        if(tasks[k] == tasks[i]){
//            count = count + 1;
//            if(count > halfSizeArray){
//                result = count * (n+1) - n;
//            }
//            if(count == charCount[0]){
//                return count * (n+1) - n+1;
//            }
//            if (count == halfSizeArray){
//                charCount[0] = count;
//                for (int j = halfSizeArray; j < tasks.length-1; j++){
//                    if(tasks[j] != tasks[j+1]){
//                        return count * (n+1) - n;
//                    }
//                }
//            }
//        }else{
//            k = i;
//            count = 1;
//        }
//    }