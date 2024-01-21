package Brute;

public class BruteForceApp {

	public static void main(String[] args) {

		int[] array = { 64, 25, 12, 22, 11 };

		System.out.println("Original array:");
		printArray(array);

		BruteForce sort = new BruteForce();
        sort.selectionSort(array);
	    
        System.out.println("\nSorted array:");
        printArray(array);
	}

	static void printArray(int[] arr) {
		for (int value : arr) {
			System.out.print(value + " ");
		}
		System.out.println();
	}
}
