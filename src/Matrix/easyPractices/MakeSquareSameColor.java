package Matrix.easyPractices;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MakeSquareSameColor {
    /*
    You are given a 2D matrix grid of size 3 x 3 consisting only of characters 'B' and 'W'. Character 'W'
    represents the white color, and character 'B' represents the black color.
    Your task is to change the color of at most one cell so that the matrix has a 2 x 2 square where all
    cells are of the same color.
    Return true if it is possible to create a 2 x 2 square of the same color, otherwise, return false.
    */
    public boolean canMakeSquare(char[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                // Cambiar el color de la celda grid[i][j]
                char originalColor = grid[i][j];
                grid[i][j] = (originalColor == 'W') ? 'B' : 'W';

                // Verificar si hay un cuadrado de 2x2 del mismo color en la matriz resultante
                if (hasSameColorSquare(grid)) {
                    return true;
                }

                // Restaurar el color original de la celda
                grid[i][j] = originalColor;
            }
        }
        return false;
    }

    private boolean hasSameColorSquare(char[][] grid) {
        for (int i = 0; i < grid.length - 1; i++) {
            for (int j = 0; j < grid[0].length - 1; j++) {
                if (grid[i][j] == grid[i][j+1] &&
                        grid[i][j] == grid[i+1][j] &&
                        grid[i][j] == grid[i+1][j+1]) {
                    return true;
                }
            }
        }
        return false;
    }
    public boolean makeSquareList(List<List<Character>> grid){
        grid.forEach(row -> row.forEach(System.out::println));
        return true;
    }

    public static void main(String[] args) {
        char[][] grid = {
                {'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'}
                };

        List<List<Character>> listGrid = Arrays.asList(
                Arrays.asList('B','W','B'),
                Arrays.asList('B','W','W'),
                Arrays.asList('B','W','B')
        );


        MakeSquareSameColor makeSquareSameColor = new MakeSquareSameColor();
        makeSquareSameColor.canMakeSquare(grid);
        makeSquareSameColor.makeSquareList(listGrid);
    }
}
