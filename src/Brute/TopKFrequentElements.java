package Brute;

import java.util.*;

public class TopKFrequentElements {

    static ArrayList<Integer> find_top_k_frequent_elements(ArrayList<Integer> arr, Integer k) {
        // Create a HashMap to store the frequency of each element
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Create a min heap PriorityQueue based on frequency
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(Comparator.comparingInt(frequencyMap::get));

        // Iterate through the frequencyMap
        for (int num : frequencyMap.keySet()) {
            minHeap.offer(num);
            // If size of minHeap exceeds k, remove the element with lowest frequency
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        // Create the result ArrayList from the minHeap
        ArrayList<Integer> result = new ArrayList<>(minHeap);

        // The order of numbers in the output array does not matter, so we can shuffle
        // the result
        Collections.shuffle(result);

        return result;
    }

    public static void main(String[] args) {

        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 4, 3, 1));
        int k1 = 3;
        System.out.println(find_top_k_frequent_elements(arr1, k1));

        // Example One
        ArrayList<Integer> arr3 = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 4, 3, 1));
        int k3 = 2;
        System.out.println(find_top_k_frequent_elements(arr3, k3));

        // Example Two
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(1, 2, 1, 2, 3, 1));
        int k2 = 1;
        System.out.println(find_top_k_frequent_elements(arr2, k2));
    }
}
