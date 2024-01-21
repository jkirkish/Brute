package Brute;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class KmostFrequentWords {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(
                Arrays.asList("car", "bus", "taxi", "car", "driver", "candy", "race", "car", "driver", "fare", "taxi"));
        int k = 4;
        ArrayList<String> result = k_most_frequent(k, words);
        System.out.println(result);
    }

    static ArrayList<String> k_most_frequent(Integer k, ArrayList<String> words) {
        ArrayList<String> result = new ArrayList<>();

        // Count word frequencies using a HashMap
        Map<String, Integer> wordFreqMap = new HashMap<>();
        for (String word : words) {
            wordFreqMap.put(word, wordFreqMap.getOrDefault(word, 0) + 1);
        }

        // Create a PriorityQueue to keep track of the top k frequent words
        PriorityQueue<Map.Entry<String, Integer>> maxHeap = new PriorityQueue<>(
                (a, b) -> a.getValue().equals(b.getValue()) ? a.getKey().compareTo(b.getKey())
                        : b.getValue() - a.getValue());

        // Add entries from the HashMap to the PriorityQueue
        for (Map.Entry<String, Integer> entry : wordFreqMap.entrySet()) {
            maxHeap.offer(entry);
        }

        // Extract words from the PriorityQueue up to the given number k
        for (int i = 0; i < k && !maxHeap.isEmpty(); i++) {
            result.add(maxHeap.poll().getKey());
        }

        return result;
    }

}
