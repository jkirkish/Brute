package Brute;

import java.util.ArrayList;
import java.util.Arrays;

public class ThreeSum {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(10, 3, -4, 1, -6, 9));
        ArrayList<String> result = find_zero_sum(arr);
        System.out.println(result);
    }

    static ArrayList<String> find_zero_sum(ArrayList<Integer> arr) {
        ArrayList<String> result = new ArrayList<>();

        // Sort the array to handle duplicates and make it easier to find unique
        // triplets
        arr.sort(Integer::compareTo);

        int n = arr.size();

        for (int i = 0; i < n - 2; i++) {
            // Avoid duplicate triplets starting with the same number
            if (i == 0 || (i > 0 && !arr.get(i).equals(arr.get(i - 1)))) {
                int left = i + 1;
                int right = n - 1;
                int targetSum = -arr.get(i);

                while (left < right) {
                    int currentSum = arr.get(left) + arr.get(right);

                    if (currentSum == targetSum) {
                        // Found a triplet
                        result.add(arr.get(i) + "," + arr.get(left) + "," + arr.get(right));

                        // Skip duplicates for the left pointer
                        while (left < right && arr.get(left).equals(arr.get(left + 1))) {
                            left++;
                        }

                        // Skip duplicates for the right pointer
                        while (left < right && arr.get(right).equals(arr.get(right - 1))) {
                            right--;
                        }

                        // Move pointers
                        left++;
                        right--;
                    } else if (currentSum < targetSum) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }

        return result;
    }

}
