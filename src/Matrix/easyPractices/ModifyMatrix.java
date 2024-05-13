package Matrix.easyPractices;

import java.util.Arrays;

public class ModifyMatrix {
    public int[][] modifiedMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = calculateMaxNumber(matrix, j);
                }
            }
        }
        System.out.println(Arrays.deepToString(matrix));
        return matrix;
    }

    private int calculateMaxNumber(int[][] matrix, int j){
        int max = 0;
        for (int i = 0; i < matrix.length; i++) {
            if(max < matrix[i][j]){
                max = matrix[i][j];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,-1},
                {4,-1,6},
                {7,8,9}
        };
        ModifyMatrix modifyMatrix = new ModifyMatrix();
        int[][] max = modifyMatrix.modifiedMatrix(matrix);
    }
}
