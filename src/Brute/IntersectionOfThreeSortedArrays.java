package Brute;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionOfThreeSortedArrays {

    static ArrayList<Integer> find_intersection(ArrayList<Integer> arr1, ArrayList<Integer> arr2,
            ArrayList<Integer> arr3) {
        ArrayList<Integer> result = new ArrayList<>();

        // Pointers for each array
        int i = 0, j = 0, k = 0;

        // Iterate through the arrays
        while (i < arr1.size() && j < arr2.size() && k < arr3.size()) {
            int num1 = arr1.get(i);
            int num2 = arr2.get(j);
            int num3 = arr3.get(k);

            // Check for intersection
            if (num1 == num2 && num2 == num3) {
                result.add(num1);
                i++;
                j++;
                k++;
            } else if (num1 < num2 || num1 < num3) {
                i++;
            } else if (num2 < num1 || num2 < num3) {
                j++;
            } else {
                k++;
            }
        }

        // If intersection is empty, return an array with one element -1
        if (result.isEmpty()) {
            result.add(-1);
        }

        return result;
    }

    public static void main(String[] args) {
        // Example One
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(2, 5, 10));
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(2, 3, 4, 10));
        ArrayList<Integer> arr3 = new ArrayList<>(Arrays.asList(2, 4, 10));
        System.out.println(find_intersection(arr1, arr2, arr3));

        // Example Two
        ArrayList<Integer> arr4 = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> arr5 = new ArrayList<>();
        ArrayList<Integer> arr6 = new ArrayList<>(Arrays.asList(2, 2));
        System.out.println(find_intersection(arr4, arr5, arr6));

        // Example Three
        ArrayList<Integer> arr7 = new ArrayList<>(Arrays.asList(1, 2, 2, 2, 9));
        ArrayList<Integer> arr8 = new ArrayList<>(Arrays.asList(1, 1, 2, 2));
        ArrayList<Integer> arr9 = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 2));
        System.out.println(find_intersection(arr7, arr8, arr9));
    }
}
