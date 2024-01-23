package Recursion;

public class Factorial {

    public static int factorial(int n) {
        // Base case
        if (n == 0) {
            return 1;
        } else {
            // Recursive case
            return n * factorial(n - 1);
        }
    }

    /*
     * the time complexity of the factorial function is O(n)
     * The factorial of a non-negative integer n, denoted as n!, is the product of
     * all positive integers up to n.
     * In simple terms, the factorial of a number is the product of that number and
     * all positive integers less than it down to 1.
     * 
     */
    public static void main(String[] args) {
        // Example usage
        int result = factorial(5);
        System.out.println(result); // Output: 120
    }
}
