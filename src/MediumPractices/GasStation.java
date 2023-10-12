package MediumPractices;

public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int currentGas = 0;
        int currentIndex = 0;
        int totalGas = 0;
        for(int i = 0; i < gas.length; i++){
            currentGas += gas[i] - cost[i];
            totalGas += gas[i] - cost[i];
            if(currentGas < 0){
                currentGas = 0;
                currentIndex = i+1;
            }
        }
        if (totalGas >= 0){
            System.out.println(currentIndex);
            return currentIndex;
        }else {
            return -1;
        }
    }
}
