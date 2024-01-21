package Brute;

import java.util.ArrayList;
import java.util.HashMap;

public class TwoSumInSortedArray {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(5);
        numbers.add(10);

        int target = 7;

        ArrayList<Integer> result = pairSumSortedArray(numbers, target);

        System.out.println("Output:");
        System.out.println(result);
    }

    static ArrayList<Integer> pairSumSortedArray(ArrayList<Integer> numbers, Integer target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            int complement = target - numbers.get(i);

            if (map.containsKey(complement)) {
                result.add(map.get(complement));
                result.add(i);
                return result;
            }

            map.put(numbers.get(i), i);
        }

        // Return [-1, -1] if no answer exists
        result.add(-1);
        result.add(-1);
        return result;
    }
}
