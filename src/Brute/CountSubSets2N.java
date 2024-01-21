package Brute;

public class CountSubSets2N {
    static int count_all_subsets(int n) {
        // Calculate 2^N
        return (int) Math.pow(2, n);
    }

    public static void main(String[] args) {
        // Example usage:
        int inputNumber = 3;
        int output = count_all_subsets(inputNumber);
        System.out.println(output);
    }
}
