package MediumPractices;

public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int currentGas = 0;
        int currentIndex = 0;
        for(int i = 0; i < gas.length; i++){
            if(gas[i] <= cost[i]){
                continue;
            }
            currentIndex = i;
            if(i < gas.length - 1){
                currentGas = currentGas + gas[i+1];
                currentGas = currentGas - cost[i] + gas[i];

            }else {
                currentGas = currentGas + gas[0];
                currentGas = currentGas - cost[i] + gas[i];
                i = 0;
            }

            if(currentIndex == i){
                break;
            }
        }
        return 0;
    }
}
