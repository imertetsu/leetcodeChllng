package StringManipulation.MediumPractices;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MultiplyStrings {
    /*
    Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.

    Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.

    Example 1:

    Input: num1 = "2", num2 = "3"
    Output: "6"
    Example 2:

    Input: num1 = "123", num2 = "456"
    Output: "56088"
     */
//    public static String multiply(String num1, String num2) {
//        int expNum1 = num1.length()-1;
//        int expNum2 = num2.length()-1;
//        long rNum1 = 0;
//        long rNum2 = 0;
//        for (int i = 0; i < num1.length(); i++) {
//            rNum1 += (long) Integer.parseInt(num1.charAt(i)+"") * (long) Math.pow(10, expNum1);
//            expNum1--;
//        }
//        for (int i = 0; i < num2.length(); i++) {
//            rNum2 += (long) Integer.parseInt(num2.charAt(i)+"") * (long) Math.pow(10, expNum2);
//            expNum2--;
//        }
//        return rNum1 * rNum2 + "";
//    }

    /*public static String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")) return "0";
        long result;
        int index = 0;
        int expNum1 = num1.length()-1;
        long rNum1 = 0;
        StringBuilder[] partialResults = new StringBuilder[num2.length()];

        for (int i = 0; i < partialResults.length; i++) {
            partialResults[i] = new StringBuilder();
        }

        for (int i = 0; i < num1.length(); i++) {
            rNum1 += (long) Integer.parseInt(num1.charAt(i)+"") * (long) Math.pow(10, expNum1);
            expNum1--;
        }


        for (int i = num2.length()-1; i > -1; i--) {
            result = rNum1 * Integer.parseInt(num2.charAt(i)+"");
            System.out.println("Partial result: " + result);
            partialResults[index].append(result);
            index++;
            System.out.println(Arrays.toString(partialResults));
        }

        for (int i = 1; i < partialResults.length; i++) {
            partialResults[i].append(addZeros(i));
            System.out.println(Arrays.toString(partialResults));
        }

        System.out.println(sumNumbersInStrings(partialResults));

        return sumNumbersInStrings(partialResults);
    }

    private static String addZeros(int zeros){
        StringBuilder cad = new StringBuilder();
        for (int i = 0; i < zeros; i++) cad.append(0);
        return cad.toString();
    }

    public static String sumNumbersInStrings(StringBuilder[] stringBuilders) {
        String totalSum = "0";

        for (StringBuilder sb : stringBuilders) {
            StringBuilder number = new StringBuilder();

            for (int i = 0; i < sb.length(); i++) {
                char c = sb.charAt(i);
                if (Character.isDigit(c)) {
                    number.append(c);
                } else {
                    if (number.length() > 0) {
                        totalSum = addStrings(totalSum, number.toString());
                        number.setLength(0); // Reset the StringBuilder
                    }
                }
            }

            if (number.length() > 0) {
                totalSum = addStrings(totalSum, number.toString());
            }
        }

        return totalSum;
    }



    public static String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int p1 = num1.length() - 1;
        int p2 = num2.length() - 1;

        while (p1 >= 0 || p2 >= 0) {
            int x1 = p1 >= 0 ? num1.charAt(p1) - '0' : 0;
            int x2 = p2 >= 0 ? num2.charAt(p2) - '0' : 0;
            int sum = x1 + x2 + carry;
            carry = sum / 10;
            result.append(sum % 10);
            p1--;
            p2--;
        }

        if (carry != 0) {
            result.append(carry);
        }

        return result.reverse().toString();
    }*/

    public static String multiply(String num1, String num2) {
        int m = num1.length();
        int n = num2.length();
        int[] result = new int[m + n];

        // Multiplicar cada dígito de num1 por cada dígito de num2 y agregar el resultado en la posición correcta
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                System.out.println("mul: "+ mul);
                int p1 = i + j, p2 = i + j + 1;
                System.out.println("p1: "+ p1);
                System.out.println("p2: "+ p2);
                int sum = mul + result[p2];
                System.out.println("sum: "+ sum);

                result[p1] += sum / 10;
                System.out.println(Arrays.toString(result));
                result[p2] = sum % 10;
                System.out.println(Arrays.toString(result));
            }
        }

        // Convertir el array de resultados a cadena, ignorando los ceros iniciales
        StringBuilder sb = new StringBuilder();
        for (int r : result) {
            if (!(sb.length() == 0 && r == 0)) {
                sb.append(r);
            }
        }

        return sb.length() == 0 ? "0" : sb.toString();
    }



    static public void main(String[] args) {
        String num1 = "123";
        String num2 = "456";

        System.out.println(multiply(num1, num2));
    }
}
