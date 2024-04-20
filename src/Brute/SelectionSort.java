package Brute;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = { 5, 2, 6, 1, 3 };

        System.out.println("Original Array:");
        printArray(array);

        selectionSort(array);

        System.out.println("\nSorted Array:");
        printArray(array);
    }

    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap array[i] with the minimum element found
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;

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
