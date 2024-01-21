package Brute;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TwoSumInAnArray {

    static ArrayList<Integer> two_sum(ArrayList<Integer> numbers, Integer target) {
        // Create a hash map to store the elements and their indices
        HashMap<Integer, Integer> map = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < numbers.size(); i++) {
            int complement = target - numbers.get(i);

            // Check if the complement exists in the map
            if (map.containsKey(complement)) {
                // Return the indices of the two elements that sum up to the target
                return new ArrayList<>(List.of(map.get(complement), i));
            }

            // Add the current element and its index to the map
            map.put(numbers.get(i), i);
        }

        // No solution found, return [-1, -1]
        return new ArrayList<>(List.of(-1, -1));
    }

    public static void main(String[] args) {
        // Example One
        ArrayList<Integer> numbers1 = new ArrayList<>(List.of(5, 3, 10, 45, 1));
        Integer target1 = 6;
        System.out.println(two_sum(numbers1, target1)); // Output: [0, 4]

        // Example Two
        ArrayList<Integer> numbers2 = new ArrayList<>(List.of(4, 1, 5, 0, -1));
        Integer target2 = 10;
        System.out.println(two_sum(numbers2, target2)); // Output: [-1, -1]
    }

}
