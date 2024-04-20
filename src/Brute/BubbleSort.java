package Brute;

//not a good algorithm for sorting
//Bubble Sort has a time complexity of O(n^2)
public class BubbleSort {
    public static void main(String[] args) {
        int[] array = { 5, 2, 6, 1, 3 };

        System.out.println("Original Array:");
        printArray(array);

        bubbleSort(array);

        System.out.println("\nSorted Array:");
        printArray(array);
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j+1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                    System.out.println("\nIteration " + (i + 1) + ":");
                    printArray(array);
                }

            }
            if (!swapped) {
                // If no two elements were swapped in the inner loop, then the array is already
                // sorted
                break;
            }

            System.out.println("\nIteration " + (i + 1) + ":");
            printArray(array);
        }
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
