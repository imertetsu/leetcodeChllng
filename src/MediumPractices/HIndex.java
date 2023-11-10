package MediumPractices;

import java.util.Arrays;
import java.util.Collections;

public class HIndex {
    public int hIndex(int[] citations) {
        int n = citations.length;
        Arrays.sort(citations);

        for (int i = 0; i < n / 2; i++) {
            int temp = citations[i];
            citations[i] = citations[n - 1 - i];
            citations[n - 1 - i] = temp;
        }

        System.out.println(Arrays.toString(citations));
        int hIndex = 0;
        for (int i = 0; i < citations.length; i++){
            if(i + 1 == citations[i]){
                hIndex = i + 1;
                return hIndex;
            }else {
                if (i + 1 <= citations [i]){
                    hIndex = i + 1;
                }
            }
        }
        return hIndex;
    }
}
