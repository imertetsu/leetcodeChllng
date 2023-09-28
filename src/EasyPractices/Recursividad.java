package EasyPractices;

public class Recursividad {

    public int factorialFrom(int n){
        if(n == 0 || n == 1){
            return 1;
        }else {
            return n * factorialFrom(n-1);
        }

    }

    public int fibonacciFrom(int n){
        if(n == 0){
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        }else {
            return fibonacciFrom(n - 1) + fibonacciFrom(n - 2);
        }
    }
}
