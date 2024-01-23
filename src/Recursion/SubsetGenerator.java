package Recursion;

import java.util.ArrayList;

public class SubsetGenerator {

    static ArrayList<String> generate_all_subsets(String s) {
        ArrayList<String> subsets = new ArrayList<>();
        generateSubsets(s, 0, "", subsets);
        return subsets;
    }

    static void generateSubsets(String s, int index, String current, ArrayList<String> subsets) {
        // Add the current subset to the result
        subsets.add(current);

        // Iterate through the remaining characters in the string
        for (int i = index; i < s.length(); i++) {
            // Include the current character in the subset
            generateSubsets(s, i + 1, current + s.charAt(i), subsets);
        }
    }

    public static void main(String[] args) {
        // Example usage
        String s = "xy";
        ArrayList<String> result = generate_all_subsets(s);
        System.out.println(result);
    }
}
