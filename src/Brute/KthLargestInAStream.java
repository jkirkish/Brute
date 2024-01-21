package Brute;

import java.util.*;

public class KthLargestInAStream {

    static ArrayList<Integer> kth_largest(Integer k, ArrayList<Integer> initial_stream,
            ArrayList<Integer> append_stream) {
        // Initialize a List to store the k largest elements
        List<Integer> kLargestList = new ArrayList<>(initial_stream);

        // Sort the kLargestList in descending order
        kLargestList.sort(Collections.reverseOrder());

        // Result list to store the k-th largest elements after each append
        ArrayList<Integer> result = new ArrayList<>();

        // Iterate through the append_stream
        for (int num : append_stream) {
            // Add the current element to the kLargestList
            kLargestList.add(num);

            // Sort the kLargestList in descending order
            kLargestList.sort(Collections.reverseOrder());

            // Add the k-th largest element to the result list
            result.add(kLargestList.get(k - 1));
        }

        return result;
    }

    public static void main(String[] args) {
        // Example
        int k = 3;
        ArrayList<Integer> initial_stream = new ArrayList<>(Arrays.asList(3, 2, 1));
        ArrayList<Integer> append_stream = new ArrayList<>(Arrays.asList(4, 4, 4));

        System.out.println(kth_largest(k, initial_stream, append_stream));
    }
}
