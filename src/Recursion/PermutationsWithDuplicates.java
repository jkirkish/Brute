package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class PermutationsWithDuplicates {
    public static ArrayList<ArrayList<Integer>> get_permutations(ArrayList<Integer> arr) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> currentPermutation = new ArrayList<>();
        boolean[] used = new boolean[arr.size()]; // Keep track of used elements to avoid duplicates
        // Sort the input array to handle duplicates
        arr.sort(null);
        permute(arr, result, currentPermutation, used);
        return result;
    }

    private static void permute(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> result,
            ArrayList<Integer> currentPermutation, boolean[] used) {
        if (currentPermutation.size() == arr.size()) {
            result.add(new ArrayList<>(currentPermutation)); // Add the current permutation to the result
            return;
        }

        for (int i = 0; i < arr.size(); i++) {
            // Skip duplicates or previously used elements
            if (used[i] || (i > 0 && arr.get(i).equals(arr.get(i - 1)) && !used[i - 1])) {
                continue;
            }
            currentPermutation.add(arr.get(i));
            used[i] = true;
            permute(arr, result, currentPermutation, used);
            used[i] = false;
            currentPermutation.remove(currentPermutation.size() - 1);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 2));

        ArrayList<ArrayList<Integer>> permutations = get_permutations(arr);
        System.out.println("Permutations for " + arr + ": " + permutations);
    }
}
