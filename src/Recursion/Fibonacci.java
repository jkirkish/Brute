package Recursion;

public class Fibonacci {
    public static Integer find_fibonacci(Integer n) {
        if (n <= 1) {
            return n; // Base case: Fibonacci of 0 and 1 is the number itself
        }

        int fib1 = 0;
        int fib2 = 1;
        int fibonacci = 0;

        // Calculate Fibonacci number iteratively
        for (int i = 2; i <= n; i++) {
            fibonacci = fib1 + fib2;
            fib1 = fib2;
            fib2 = fibonacci;
        }

        return fibonacci;
    }

    public static void main(String[] args) {
        int n = 2;
        System.out.println("The " + n + "nd Fibonacci number is: " + find_fibonacci(n));
    }
}
