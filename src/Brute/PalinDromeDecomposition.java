package Brute;

import java.util.ArrayList;

public class PalinDromeDecomposition {

    static ArrayList<String> generate_palindromic_decompositions(String s) {
        ArrayList<String> result = new ArrayList<>();
        decompose(s, 0, new ArrayList<>(), result);
        return result;
    }

    static void decompose(String s, int start, ArrayList<String> currentDecomposition, ArrayList<String> result) {
        if (start == s.length()) {
            result.add(String.join("|", currentDecomposition));
            return;
        }

        for (int end = start + 1; end <= s.length(); end++) {
            String substring = s.substring(start, end);
            if (isPalindrome(substring)) {
                currentDecomposition.add(substring);
                decompose(s, end, currentDecomposition, result);
                currentDecomposition.remove(currentDecomposition.size() - 1);
            }
        }
    }

    static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "abracadabra";
        ArrayList<String> decompositions = generate_palindromic_decompositions(s);
        for (String decomposition : decompositions) {
            System.out.println(decomposition);
        }
    }

}
