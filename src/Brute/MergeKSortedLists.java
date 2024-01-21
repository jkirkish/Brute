package Brute;

import java.util.ArrayList;
import java.util.PriorityQueue;

class LinkedListNode {
    int val;
    LinkedListNode next;

    LinkedListNode(int val) {
        this.val = val;
    }
}

public class MergeKSortedLists {

    static LinkedListNode mergeKLists(ArrayList<LinkedListNode> lists) {
        // Priority queue to keep track of the smallest node among the heads of k lists
        PriorityQueue<LinkedListNode> minHeap = new PriorityQueue<>((a, b) -> Integer.compare(a.val, b.val));

        // Add the heads of all lists to the min-heap
        for (LinkedListNode list : lists) {
            if (list != null) {
                minHeap.add(list);
            }
        }

        // Dummy node to simplify the result list creation
        LinkedListNode dummy = new LinkedListNode(0);
        LinkedListNode current = dummy;

        // Process the min-heap until it's empty
        while (!minHeap.isEmpty()) {
            // Get the smallest node from the min-heap
            LinkedListNode smallest = minHeap.poll();

            // Add the smallest node to the result list
            current.next = smallest;
            current = current.next;

            // Move the pointer in the list from which the smallest node was taken
            if (smallest.next != null) {
                minHeap.add(smallest.next);
            }
        }

        return dummy.next; // Return the merged sorted list
    }

    public static void main(String[] args) {
        // Example Usage
        LinkedListNode list1 = new LinkedListNode(1);
        list1.next = new LinkedListNode(3);
        list1.next.next = new LinkedListNode(5);

        LinkedListNode list2 = new LinkedListNode(3);
        list2.next = new LinkedListNode(4);

        LinkedListNode list3 = new LinkedListNode(7);

        ArrayList<LinkedListNode> lists = new ArrayList<>();
        lists.add(list1);
        lists.add(list2);
        lists.add(list3);

        LinkedListNode result = mergeKLists(lists);

        // Print the result list
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
        // Output: 1 3 3 4 5 7
    }
}
