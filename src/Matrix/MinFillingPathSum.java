package Matrix;

public class MinFillingPathSum {
    public int minFallingPathSum(int[][] matrix) {
        int min = 0;
        System.out.println("COLUMNAS "+matrix[0].length);
        System.out.println("FILAS "+matrix.length);
        external:for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                System.out.println(matrix[i][j]);
            }
        }
        return 0;
    }
}
