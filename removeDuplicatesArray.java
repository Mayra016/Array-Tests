import java.util.Arrays;

class RemoveDuplicatesArray {
    public int removeDuplicates(int[] nums) {

        Arrays.sort(nums);
        int previous = -9999;
        int x = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != previous) {
                previous = nums[i];
                nums[x] = nums[i];
                x++;
            }         
        }
    

        return x;   
    }
}
