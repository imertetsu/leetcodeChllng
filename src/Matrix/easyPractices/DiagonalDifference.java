package Matrix.easyPractices;

import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int sumj = 0;
        int sumi = 0;
        for (int i = 0, tam = arr.size() -1; i < arr.get(0).size(); i++, tam--){
            sumj = sumj + arr.get(i).get(i);
            sumi = sumi + arr.get(i).get(tam);
        }
        System.out.println("Sumj: " + sumj);
        System.out.println("Sumi: " + sumi);
        System.out.println("resultado de la suma absoluta es: "+ Math.abs(sumj - sumi));
        return Math.abs(sumj - sumi);
    }

    public static void main(String[] args) {
        List<List<Integer>> matrixList = Arrays.asList(
                Arrays.asList(11, 2, 4),
                Arrays.asList(4, 5, 6),
                Arrays.asList(10, 8, -12)
        );
        diagonalDifference(matrixList);
    }
}
