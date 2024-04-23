import java.util.Arrays;

class SlicedMaxNumber {
  
/* k represents the maximum numbers displayed on screen. This method calculate the greatest number between the numbers
  displayed on screen and save all greatest number in an array. */
  
    public int[] maxSlidingWindow(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        int[] maxNums = new int[nums.length - k + 1];

        for (int i = 0; i <= nums.length - k; i++) {
            for (int x = i; x < i + k; x++) {
                max = Math.max(max, nums[x]);
            }

            maxNums[i] = max;
            max = Integer.MIN_VALUE;
        }

        return nums.length == 1 ? nums : maxNums;
    }
}
