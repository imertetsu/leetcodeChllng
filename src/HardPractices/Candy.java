package HardPractices;

import java.util.Arrays;

public class Candy {
    public int candy(int[] ratings) {
        int[] result = new int[ratings.length];
        int candies = 0;

        for (int i = 0; i < ratings.length; i++){
            if(i == 0){
                if(ratings[i] > ratings[i + 1]){
                    result[i] = 2;
                    candies += 2;
                }else {
                    result[i] = 1;
                    candies += 1;
                }
                continue;
            }
            if (i == ratings.length - 1){
                if(ratings[i] > ratings[i - 1]){
                    result[i] = 2;
                    candies += 2;
                }else {
                    result[i] = 1;
                    candies += 1;
                }
                continue;
            }
            if(ratings[i] >= ratings[i + 1] && ratings[i] >= ratings[i - 1]){
                result[i] = 2;
                candies += 2;
            }else {
                result[i] = 1;
                candies += 1;
            }
        }
        System.out.println(Arrays.toString(result));
        System.out.println(candies);
        return candies;
    }
}
