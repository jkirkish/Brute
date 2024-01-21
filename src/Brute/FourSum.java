package Brute;

import java.util.ArrayList;
import java.util.Arrays;

public class FourSum {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(0, 0, 1, 3, 2, -1));
        int target = 3;
        ArrayList<ArrayList<Integer>> result = four_sum(arr, target);
        System.out.println(result);
    }

    static ArrayList<ArrayList<Integer>> four_sum(ArrayList<Integer> arr, int target) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int n = arr.size();

        // Sort the array for easier duplicate handling
        arr.sort(Integer::compareTo);

        for (int i = 0; i < n - 3; i++) {
            for (int j = i + 1; j < n - 2; j++) {
                int left = j + 1;
                int right = n - 1;

                while (left < right) {
                    int currentSum = arr.get(i) + arr.get(j) + arr.get(left) + arr.get(right);

                    if (currentSum == target) {
                        // Found a quadruple
                        ArrayList<Integer> quadruple = new ArrayList<>(
                                Arrays.asList(arr.get(i), arr.get(j), arr.get(left), arr.get(right)));
                        result.add(quadruple);

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
                    } else if (currentSum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }

                // Skip duplicates for the second element
                while (j < n - 2 && arr.get(j).equals(arr.get(j + 1))) {
                    j++;
                }
            }

            // Skip duplicates for the first element
            while (i < n - 3 && arr.get(i).equals(arr.get(i + 1))) {
                i++;
            }
        }

        return result;
    }

}
