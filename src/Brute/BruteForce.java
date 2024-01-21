package Brute;

public class BruteForce {
	
	/*Simplest design strategy
	 * the most straight forward approach, usually based on the problem statement
	 * input sequence of numbers
	 * a1,a2,a3,....An
	 * 2 5 4 10 7
	 * the output is a permutation of the sequence of numbers of increasing order
	 * 2 4 5 7 10
	 * 
	 * A bruthe force algorithm 
	 * 1) Locate the smallest item and put it in the first place
	 * 2) Then select the next smallestitem and put it in the second place. And so on. 
	 * 3) Sorting by repeated selection: "Selection Sort""
	 * 4) Final output ordering generted one by one in sequence
	 * How do we analyze this algorithm?
	 *    -argue that it is correct. 
	 *    -quantify its efficiency
	 *    a) Time: how long the algorithm takes to run ("running time")
	 *    b) Space: How much memory does the algorithm use to run?
	 * 
	 * 
	 */
     public void selectionSort(int [] arr) {
    	 
    	 int n = arr.length;
    		
    	 for (int i = 0; i < n - 1; i++) {
    		// Find the minimum element in the unsorted array
             int minIndex = i;
             for (int j = i + 1; j < n; j++) {
                 if (arr[j] < arr[minIndex]) {
                     minIndex = j;
                 }
             }
             // Swap the found minimum element with the first element
             int temp = arr[minIndex];
             arr[minIndex] = arr[i];
             arr[i] = temp;
         }
    	 }
    	 
}


