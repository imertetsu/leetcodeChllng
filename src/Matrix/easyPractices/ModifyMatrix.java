package Matrix.easyPractices;

import java.util.Arrays;

public class ModifyMatrix {
    /*Given a 0-indexed m x n integer matrix, create a new 0-indexed matrix called answer.
    Make answer equal to matrix, then replace each element with the value -1 with the maximum element
    in its respective column.
    Return the matrix answer.
    Input: matrix = [[1,2,-1],[4,-1,6],[7,8,9]]
    Output: [[1,2,9],[4,8,6],[7,8,9]]
    Explanation: The diagram above shows the elements that are changed (in blue).
    - We replace the value in the cell [1][1] with the maximum value in the column 1, that is 8.
    - We replace the value in the cell [0][2] with the maximum value in the column 2, that is 9.
    */
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
