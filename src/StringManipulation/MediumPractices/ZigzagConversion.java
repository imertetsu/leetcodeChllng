package StringManipulation.MediumPractices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ZigzagConversion {
    /*
    The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

    P   A   H   N
    A P L S I I G
    Y   I   R
    And then read line by line: "PAHNAPLSIIGYIR"

    Write the code that will take a string and make this conversion given a number of rows:
    string convert(string s, int numRows);

    Example 2:

    Input: s = "PAYPALISHIRING", numRows = 4
    Output: "PINALSIGYAHRPI"
    Explanation:
    P     I    N
    A   L S  I G
    Y A   H R
    P     I
     */

    public static String convert(String s, int numRows) {
        if (numRows == 1) return s;

        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < rows.length; i++) {
            rows[i] = new StringBuilder();
        }
        System.out.println("String Builder Array: "+ Arrays.toString(rows));

        int currentRow = 0;
        boolean goingDown = false;

        for (char c : s.toCharArray()) {
            rows[currentRow].append(c);
            System.out.println("Adding char: "+Arrays.toString(rows));
            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;
            }
            currentRow += goingDown ? 1 : -1;
        }
        System.out.println("Construction: "+Arrays.toString(rows));

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < rows.length; i++) {
            result.append(rows[i]);
        }

        return result.toString();
    }

    public static void main(String[] args) {
//        String s1 = "PAYPALISHIRING";
//        int numRows1 = 3;
//        System.out.println(convert(s1, numRows1));

        String s2 = "PAYPALISHIRING";
        int numRows2 = 4;
        System.out.println(convert(s2, numRows2));
    }
}
