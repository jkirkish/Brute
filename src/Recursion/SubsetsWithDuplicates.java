package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class SubsetsWithDuplicates {
    public static ArrayList<String> get_distinct_subsets(String s) {
        ArrayList<String> result = new ArrayList<>();
        char[] chars = s.toCharArray();
        Arrays.sort(chars); // Sort the characters to handle duplicates properly
        backtrack(result, new StringBuilder(), chars, 0);
        return result;
    }

    private static void backtrack(ArrayList<String> result, StringBuilder currentSubset, char[] chars, int index) {
        result.add(currentSubset.toString()); // Add the current subset to the result

        for (int i = index; i < chars.length; i++) {
            if (i > index && chars[i] == chars[i - 1]) {
                continue; // Skip duplicate characters to avoid duplicate subsets
            }
            currentSubset.append(chars[i]); // Include the current character in the subset
            backtrack(result, currentSubset, chars, i + 1); // Recur with the next index
            currentSubset.deleteCharAt(currentSubset.length() - 1); // Backtrack: remove the last character
        }
    }

    public static void main(String[] args) {
        String s1 = "aab";
        String s2 = "dc";

        ArrayList<String> subsets1 = get_distinct_subsets(s1);
        ArrayList<String> subsets2 = get_distinct_subsets(s2);

        System.out.println("Subsets for " + s1 + ": " + subsets1);
        System.out.println("Subsets for " + s2 + ": " + subsets2);
    }
}
