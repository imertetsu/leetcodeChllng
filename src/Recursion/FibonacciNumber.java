package Recursion;

public class FibonacciNumber {
    public static int fib(int n) {
        if(n == 0 || n == 1)
            return n;

        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fib(7));
        try{
            System.out.println("123");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
