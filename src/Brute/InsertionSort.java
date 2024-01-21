package Brute;

import java.util.ArrayList;

//time complexity of Insertion Sort is O(n^2) 
public class InsertionSort {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(64);
        arrayList.add(34);

        System.out.println("Original ArrayList:");
        printArrayList(arrayList);

        insertionSort(arrayList);

        System.out.println("\nSorted ArrayList:");
        printArrayList(arrayList);
    }

    // Insertion Sort method for ArrayList
    static void insertionSort(ArrayList<Integer> arr) {
        int n = arr.size();

        // Outer loop iterates through each element starting from the second one (index
        // 1)
        for (int i = 1; i < n; ++i) {
            // Store the current element to be inserted in the correct position
            int key = arr.get(i);

            // Initialize a variable to move through the sorted part of the array
            int j = i - 1;

            // Move elements of arr[0..i-1] that are greater than key
            // to one position ahead of their current position
            while (j >= 0 && arr.get(j) > key) {
                // Shift the elements to the right to make space for the key
                arr.set(j + 1, arr.get(j));
                // Move to the previous position in the sorted part
                j = j - 1;
            }

            // Place the key in its correct position in the sorted part of the array
            arr.set(j + 1, key);
            System.out.print("New Array: ");
            printArrayList(arr);
        }

    }

    // Utility method to print an ArrayList
    static void printArrayList(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
    }
}
