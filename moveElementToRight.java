class MoveElementToRight {
    public void rotate(int[] nums, int k) {
	    
        int[] nums2 = Arrays.copyOf(nums, nums.length);
        
        int x = 0;
        for ( int i = 0; i < nums.length; i++ ) {
            if (i + k < nums.length) {
                nums[i + k] = nums2[i];
            } else {
                nums[x] = nums2[i];
                x++;
            }
        }
    }
}
