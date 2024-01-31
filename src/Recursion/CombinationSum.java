package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class CombinationSum {
    static ArrayList<ArrayList<Integer>> generate_all_combinations(ArrayList<Integer> arr, Integer target) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> current = new ArrayList<>();
        // Sort the input array to handle duplicates properly
        arr.sort(null);
        generate_all_combinationsUtil(arr, target, 0, current, result);
        return result;
    }

    private static void generate_all_combinationsUtil(ArrayList<Integer> arr, int target, int start,
            ArrayList<Integer> current, ArrayList<ArrayList<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < arr.size(); i++) {
            if (arr.get(i) > target)
                break; // Optimization to prune unnecessary branches
            if (i > start && arr.get(i).equals(arr.get(i - 1)))
                continue; // Skip duplicates
            current.add(arr.get(i));
            generate_all_combinationsUtil(arr, target - arr.get(i), i + 1, current, result);
            current.remove(current.size() - 1); // Backtrack
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        int target1 = 3;
        ArrayList<ArrayList<Integer>> result1 = generate_all_combinations(arr1, target1);
        System.out.println("Output for arr1, target1: " + result1);

        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(1, 1, 1, 1));
        int target2 = 2;
        ArrayList<ArrayList<Integer>> result2 = generate_all_combinations(arr2, target2);
        System.out.println("Output for arr2, target2: " + result2);
    }
}
