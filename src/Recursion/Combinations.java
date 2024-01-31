package Recursion;

import java.util.ArrayList;

public class Combinations {
    public static ArrayList<ArrayList<Integer>> find_combinations(Integer n, Integer k) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> currentCombination = new ArrayList<>();
        backtrack(result, currentCombination, 1, n, k);
        return result;
    }

    private static void backtrack(ArrayList<ArrayList<Integer>> result, ArrayList<Integer> currentCombination,
            int start, int n, int k) {
        if (k == 0) {
            result.add(new ArrayList<>(currentCombination)); // Add the current combination to the result
            return;
        }

        for (int i = start; i <= n; i++) {
            currentCombination.add(i); // Include current number in the combination
            backtrack(result, currentCombination, i + 1, n, k - 1); // Recur with the next number and k-1
            currentCombination.remove(currentCombination.size() - 1); // Backtrack: remove the last number
        }
    }

    public static void main(String[] args) {
        Integer n1 = 5;
        Integer k1 = 2;
        Integer n2 = 6;
        Integer k2 = 6;

        ArrayList<ArrayList<Integer>> combinations1 = find_combinations(n1, k1);
        ArrayList<ArrayList<Integer>> combinations2 = find_combinations(n2, k2);

        System.out.println("Combinations for n=" + n1 + ", k=" + k1 + ": " + combinations1);
        System.out.println("Combinations for n=" + n2 + ", k=" + k2 + ": " + combinations2);
    }
}
