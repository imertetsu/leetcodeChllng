package MediumPractices;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TaskScheduler {
    public int leastInterval(char[] tasks, int n) {
        if (n == 0) return tasks.length;
        Map<Character, Integer> taskCounts = new HashMap<>();
        int maxCount = 0;
        int numMaxTasks = 0;

        // Count frequencies and find the task with maximum count
        for (char task : tasks) {
            taskCounts.put(task, taskCounts.getOrDefault(task, 0) + 1);
            int count = taskCounts.get(task);
            if (count > maxCount) {
                maxCount = count;
                numMaxTasks = 1;
            } else if (count == maxCount) {
                numMaxTasks++;
            }
        }

        // Calculate the minimum time required
        int partCount = maxCount - 1;
        int partLength = n - (numMaxTasks - 1);
        int emptySlots = partCount * partLength;
        int availableTasks = tasks.length - maxCount * numMaxTasks;
        int idleSlots = Math.max(0, emptySlots - availableTasks);

        return tasks.length + idleSlots;
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