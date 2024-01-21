package Brute;

import java.util.ArrayList;
import java.util.Arrays;

public class ThreeSumSmaller {

    public static void main(String[] args) {
        ArrayList<Integer> numbers1 = new ArrayList<>(Arrays.asList(5, 0, -1, 3, 2));
        int target1 = 4;
        int result1 = count_triplets(target1, numbers1);
        System.out.println(result1);

        ArrayList<Integer> numbers2 = new ArrayList<>(Arrays.asList(2, 2, 2, 1));
        int target2 = 7;
        int result2 = count_triplets(target2, numbers2);
        System.out.println(result2);
    }

    static Integer count_triplets(Integer target, ArrayList<Integer> numbers) {
        int n = numbers.size();
        int count = 0;

        // Sort the array
        numbers.sort(Integer::compareTo);

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int currentSum = numbers.get(i) + numbers.get(left) + numbers.get(right);

                // If the sum is less than the target, all triplets with the current left and
                // right pointers are valid
                if (currentSum < target) {
                    count += (right - left);
                    left++;
                } else {
                    right--;
                }
            }
        }

        return count;
    }

}
/*
 * Here are some common Big O notations and their meanings:
 * 
 * O(1) - Constant Time:
 * 
 * The algorithm's runtime or space requirements remain constant regardless of
 * the input size.
 * Example: Accessing an element in an array by index.
 * O(log n) - Logarithmic Time:
 * 
 * The algorithm's performance grows logarithmically as the input size
 * increases.
 * Example: Binary search in a sorted array.
 * O(n) - Linear Time:
 * 
 * The runtime or space requirements grow linearly with the size of the input.
 * Example: Iterating through elements in an array.
 * O(n log n) - Linearithmic Time:
 * 
 * The growth rate is between linear and logarithmic.
 * Example: Merge sort or quicksort.
 * O(n^2) - Quadratic Time:
 * 
 * The runtime or space requirements grow proportionally to the square of the
 * input size.
 * Example: Nested loops that iterate over an input.
 * O(2^n) - Exponential Time:
 * 
 * The growth rate is exponential, often associated with algorithms that solve
 * problems through recursive branching.
 * Example: Recursive algorithms without memoization.
 * 
 * 
 */