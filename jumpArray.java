class JumpArray {
    // This code will jump through an array. It will take the value of the first index and the value will be the new index.
    // If the index is equal to 0, it will return false, because this array can't be jumped through.
    public boolean canJump(int[] nums) {
        int k = nums[0];
        int result = k;      

        while ( k < nums.length &&  nums[k] != 0 ) {
            result = result + nums[k];
            k = k + nums[k];
        }

        return result < nums.length - 1 ? false : true;
    }
}
