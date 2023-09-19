package EasyPractices;

import java.util.ArrayList;
import java.util.List;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE; // Inicializamos el mínimo precio como el máximo valor posible
        int maxProfit = 0; // Inicializamos el beneficio máximo como cero

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i]; // Actualizamos el mínimo precio si encontramos un precio más bajo
            } else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice; // Actualizamos el beneficio máximo si encontramos un beneficio mayor
            }
        }
        System.out.println(maxProfit);
        return maxProfit;
    }
}
