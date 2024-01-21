package Brute;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class KthLargestInArray {

    static Integer kth_largest_in_an_array(ArrayList<Integer> numbers, Integer k) {
        // Create a min heap PriorityQueue
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Iterate through the numbers and add them to the min heap
        for (int num : numbers) {
            minHeap.offer(num);

            // If the size of the min heap exceeds k, remove the smallest element
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        // The top element of the min heap will be the k-th largest number
        return minHeap.peek();
    }

    public static void main(String[] args) {
        // Example One
        ArrayList<Integer> numbers1 = new ArrayList<>(Arrays.asList(5, 1, 10, 3, 2));
        int k1 = 2;
        System.out.println(kth_largest_in_an_array(numbers1, k1));

        // Example Two
        ArrayList<Integer> numbers2 = new ArrayList<>(Arrays.asList(4, 1, 2, 2, 3));
        int k2 = 4;
        System.out.println(kth_largest_in_an_array(numbers2, k2));
    }
}
