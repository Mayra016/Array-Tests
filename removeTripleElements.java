class RemoveTripleElements {
    public int removeDuplicates(int[] nums) {
        byte repeated = 0;

        // Check if the element appears more than 3 times, if so asign a symbolic value of -99999 to filter this value
        for ( int i = 0; i < nums.length; i++ ) {
            for ( int x = 0; x < nums.length; x++ ) {
                if (nums[i] == nums[x]) {
                    repeated++;
                    if (repeated >= 3) {
                        nums[i] = -99999;
                    }
                }
            }
            repeated = 0;
        }

        // Remove symbolic value
        nums = Arrays.stream(nums)
                .filter( n -> n != -99999)
                .toArray();  

        return nums.length;       
    }
}
