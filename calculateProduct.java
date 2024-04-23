class CalculateProduct {
    /*
    * It will multiply all elements in the array and verify how many zeros it has.
    * Divide all the multiply by the element and check if there is a zero.
    */
  
    public int[] productExceptSelf(int[] nums) {
        int[] results = new int[nums.length];
        int multiplication = 1;
        byte zeros = 0;

        for (int num : nums) {
            if (num != 0) {
                multiplication *= num;
            }  
            if (num == 0) {
                zeros++;
            }  
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                results[i] = multiplication / nums[i];
            }  

            if (zeros >= 1 && nums[i] != 0) {
                results[i] = 0;
            }

            if (zeros == 1 && nums[i] == 0) {
                results[i] = multiplication;
            }
        }

        return results;
    }
}
