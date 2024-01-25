package Brute;

import java.util.Arrays;

public class RadixSort {
    // A utility function to get the maximum value in arr[]
    static int getMax(int arr[]) {
        int n = arr.length;
        int max = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i] > max)
                max = arr[i];
        return max;
    }

    // Using counting sort to sort the elements based on significant places
    static void countingSort(int arr[], int exp) {
        int n = arr.length;
        int output[] = new int[n]; // output array
        int count[] = new int[10];
        Arrays.fill(count, 0);

        // Store count of occurrences in count[]
        for (int i = 0; i < n; i++)
            count[(arr[i] / exp) % 10]++;

        // Change count[i] so that count[i] now contains
        // actual position of this digit in output[]
        for (int i = 1; i < 10; i++)
            count[i] += count[i - 1];

        // Build the output array
        for (int i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        // Copy the output array to arr[] so that arr[] contains
        // sorted numbers according to the current digit
        System.arraycopy(output, 0, arr, 0, n);
    }

    // The main function to that sorts 'arr' using Radix Sort
    static void radixSort(int arr[]) {
        // Find the maximum number to know the number of digits
        int max = getMax(arr);

        // Do counting sort for every digit
        for (int exp = 1; max / exp > 0; exp *= 10)
            countingSort(arr, exp);
    }

    // A utility function to print an array
    static void print(int arr[]) {
        int n = arr.length;
        for (int value : arr)
            System.out.print(value + " ");
    }

    // Driver program to test above functions
    public static void main(String[] args) {
        int arr[] = { 170, 45, 75, 90, 802, 24, 2, 66 };
        int n = arr.length;

        System.out.println("Original array:");
        print(arr);

        radixSort(arr);

        System.out.println("\nSorted array:");
        print(arr);
    }
}
