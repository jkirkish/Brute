package Brute;

import java.util.ArrayList;

public class MergedArray {

    public static void main(String[] args) {
        ArrayList<Integer> first = new ArrayList<>();
        first.add(1);
        first.add(3);
        first.add(5);

        ArrayList<Integer> second = new ArrayList<>();
        second.add(2);
        second.add(4);
        second.add(6);
        second.add(0);
        second.add(0);
        second.add(0);

        ArrayList<Integer> merged = merge_one_into_another(first, second);

        System.out.println(merged);
    }

    static ArrayList<Integer> merge_one_into_another(ArrayList<Integer> first, ArrayList<Integer> second) {
        int n = first.size();
        int i = n - 1; // index for the non-zero elements in the first array
        int j = n - 1; // index for the non-zero elements in the second array
        int k = second.size() - 1; // index for the merged array

        while (i >= 0 && j >= 0) {
            if (first.get(i) > second.get(j)) {
                second.set(k--, first.get(i--));
            } else {
                second.set(k--, second.get(j--));
            }
        }

        // If there are remaining elements in the first array, copy them to the merged
        // array
        while (i >= 0) {
            second.set(k--, first.get(i--));
        }

        return second;
    }

    static void displayArrayList(ArrayList<Integer> arrayList) {
        System.out.println("ArrayList elements:");
        for (int num : arrayList) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

}
