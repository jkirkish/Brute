package Recursion;

import java.util.ArrayList;

public class Permutations {
    public static ArrayList<ArrayList<Integer>> get_permutations(ArrayList<Integer> arr) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        generatePermutations(arr, 0, result);
        return result;
    }

    private static void generatePermutations(ArrayList<Integer> arr, int index, ArrayList<ArrayList<Integer>> result) {
        if (index == arr.size() - 1) {
            result.add(new ArrayList<>(arr)); // Add the permutation to the result
            return;
        }

        for (int i = index; i < arr.size(); i++) {
            swap(arr, index, i); // Swap current element with every other element
            generatePermutations(arr, index + 1, result); // Recur for the next index
            swap(arr, index, i); // Backtrack: restore the array to its original state
        }
    }

    private static void swap(ArrayList<Integer> arr, int i, int j) {
        int temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, temp);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);

        ArrayList<ArrayList<Integer>> permutations = get_permutations(arr);
        for (ArrayList<Integer> permutation : permutations) {
            System.out.println(permutation);
        }
    }
}
