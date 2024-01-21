package Brute;

import java.util.*;

public class OnlineMedian {

    static ArrayList<Integer> online_median(ArrayList<Integer> stream) {
        // Create max heap for the lower half of the numbers
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        // Create min heap for the upper half of the numbers
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Result list to store the median after each insertion
        ArrayList<Integer> result = new ArrayList<>();

        // Iterate through the stream
        for (int num : stream) {
            // Insert the current number into the appropriate heap
            if (maxHeap.isEmpty() || num <= maxHeap.peek()) {
                maxHeap.offer(num);
            } else {
                minHeap.offer(num);
            }

            // Balance the heaps
            if (maxHeap.size() > minHeap.size() + 1) {
                minHeap.offer(maxHeap.poll());
            } else if (minHeap.size() > maxHeap.size()) {
                maxHeap.offer(minHeap.poll());
            }

            // Calculate the current median and add it to the result list
            if (maxHeap.size() == minHeap.size()) {
                result.add((maxHeap.peek() + minHeap.peek()) / 2);
            } else {
                result.add(maxHeap.peek());
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // Example
        ArrayList<Integer> stream = new ArrayList<>(Arrays.asList(3, 8, 5, 2));
        System.out.println(online_median(stream));
    }
}
