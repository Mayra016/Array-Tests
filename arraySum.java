import java.util.*;
/*
  This code will find the minimal numbers combination to sum and reach the target number
*/

class ArraySum {
    public int minSubArrayLen(int target, int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        int sum = 0;

        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.println(nums[i]);
            System.out.println(sum);
            System.out.println(result);

            if (sum >= target) {

                return result;
            }

            if (sum < target) {
                result++;
                sum += nums[i];
            }

            if (result >= nums.length) {
                return 0;
            }
            
        }

        return result;
        
    }
}
