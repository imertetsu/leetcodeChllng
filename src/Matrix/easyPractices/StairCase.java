package Matrix.easyPractices;

public class StairCase {
    /*
    Staircase detail

    This is a staircase of size : n = 4

       #
      ##
     ###
    ####
    Its base and height are both equal to . It is drawn using # symbols and spaces.
    The last line is not preceded by any spaces.

    Write a program that prints a staircase of size
     */
    public static void staircase(int n) {
        // Write your code here
        StringBuilder cad = new StringBuilder();
        for (int i = 0; i < n; i++) {
            cad.append(" ");
        }
        for (int j = n; j > 0; j--) {
            cad.setCharAt(j-1, '#');
            System.out.println(cad);
        }
    }

    public static void main(String[] args) {
        staircase(10);
    }
}
