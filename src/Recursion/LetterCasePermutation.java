package Recursion;

import java.util.ArrayList;

public class LetterCasePermutation {
    public static ArrayList<String> letter_case_permutations(String s) {
        ArrayList<String> result = new ArrayList<>();
        generatePermutations(s.toCharArray(), 0, result);
        return result;
    }

    private static void generatePermutations(char[] chars, int index, ArrayList<String> result) {
        if (index == chars.length) {
            result.add(new String(chars)); // Add the permutation to the result
            return;
        }

        char currentChar = chars[index];
        if (Character.isLetter(currentChar)) {
            // Toggle the case of the current character
            chars[index] = Character.toLowerCase(currentChar);
            generatePermutations(chars, index + 1, result); // Recur with the current character in lower case
            chars[index] = Character.toUpperCase(currentChar);
            generatePermutations(chars, index + 1, result); // Recur with the current character in upper case
        } else {
            generatePermutations(chars, index + 1, result); // If not a letter, proceed to the next character
        }
    }

    public static void main(String[] args) {
        String s1 = "a1z";
        String s2 = "123";

        ArrayList<String> permutations1 = letter_case_permutations(s1);
        ArrayList<String> permutations2 = letter_case_permutations(s2);

        System.out.println("Permutations for " + s1 + ": " + permutations1);
        System.out.println("Permutations for " + s2 + ": " + permutations2);
    }
}
