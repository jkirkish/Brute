package rearrangmentsNumbers;

public class Main {

    public static void main(String[] args) {
        // Example usage:
        RearrangeNums nums = new RearrangeNums();
        int[] inputNumbers = { 1, 2, 3, 4 };

        System.out.println("1 " + "2 " + "3 " + "4");
        nums.rearrangeNumbers(inputNumbers);

        // Print the rearranged array
        for (int num : inputNumbers) {
            System.out.print(num + " ");
        }

    }

}
