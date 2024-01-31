package Recursion;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.Map;

public class WordsFromPhoneNumber {
    static ArrayList<String> get_words_from_phone_number(String phone_number) {
        Map<Character, String> digitMapping = new HashMap<>();
        digitMapping.put('2', "abc");
        digitMapping.put('3', "def");
        digitMapping.put('4', "ghi");
        digitMapping.put('5', "jkl");
        digitMapping.put('6', "mno");
        digitMapping.put('7', "pqrs");
        digitMapping.put('8', "tuv");
        digitMapping.put('9', "wxyz");

        ArrayList<String> result = new ArrayList<>();

        // Since digits 0 and 1 map to no characters, remove them from the input string
        // as they have no effect on the output
        phone_number = phone_number.replace("0", "").replace("1", "");
        if (phone_number.length() == 0) {
            result.add("");
        } else {
            get_words_from_phone_numberUtil(phone_number, result, digitMapping, 0, new StringBuffer());
        }
        return result;
    }

    private static void get_words_from_phone_numberUtil(String phone_number,
            ArrayList<String> result,
            Map<Character, String> digitMapping,
            int currentIndex,
            StringBuffer word) {

        if (currentIndex == phone_number.length()) {
            result.add(word.toString());
            return;
        }

        String letters = digitMapping.get(phone_number.charAt(currentIndex));

        for (char letter : letters.toCharArray()) {
            get_words_from_phone_numberUtil(phone_number, result, digitMapping, currentIndex + 1, word.append(letter));
            word.deleteCharAt(currentIndex); // Backtrack.
        }
    }

    public static void main(String[] args) {
        String phone_number = "1234567";
        ArrayList<String> combinations = get_words_from_phone_number(phone_number);
        System.out.println(combinations);
    }
}
