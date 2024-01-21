package rearrangmentsNumbers;

public class RearrangeNums {
	
	public static void rearrangeNumbers(int[] nums) {
        // Initialize two pointers
		//nums[1,2,3,4] 
        int left = 0;
        int right = nums.length - 1;
          //   1    <  3
        for (; left < right; left++) {
            // Move left pointer to the right until an odd number is found
        	//     ( 1   <   3 )T &&  (2  % 2 == 0 )T   false
            while (left < right && nums[left] % 2 == 0) {
                left++;
            }

            // Move right pointer to the left until an even number is found
             //    (0   <  3 ) T && ( 4 ) %  2 == 1)F   false 
            while (left < right && nums[right] % 2 == 1) {
                right--;
            }

            // Swap the even and odd numbers
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
        }
    }


}
