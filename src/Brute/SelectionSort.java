package Brute;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 0 };

        System.out.println("Original Array:");
        printArray(array);

        selectionSort(array);

        System.out.println("\nSorted Array:");
        printArray(array);
    }

    /*
     * It's not an efficient sorting algorithm for large datasets,
     * /time complexity of Selection Sort, expressed in Big O notation, is O(n^2)
     * / Selection Sort method
     * This means that the time it takes to sort a list of elements using Selection
     * Sort grows quadratically with the size of the input list. The algorithm has
     * nested loops,
     * where the outer loop runs n times (for each element in the list), and the
     * inner loop also
     * runs n times in the worst case (to find the minimum element in the unsorted
     * portion of the list).
     */
    static void selectionSort(int[] arr) {
        int n = arr.length;

        // One by one move the boundary of the unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in the unsorted array
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            /*
             * Swap the found minimum element with the first element
             * The swap part in the Selection Sort algorithm is responsible
             * for moving the minimum element found in the unsorted portion
             * of the array to its correct position in the sorted part.
             * Let's look at the relevant code:
             */
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
            printArray(arr);
        }
    }

    // Utility method to print an array
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
