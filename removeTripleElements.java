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

    // Just track the length without taking care of the array's content
    public int removeDuplicatesWithOutSymbolicNum(int[] nums) {
        int length = 0;
        int repeated = 0;
        

        for (int i = 0; i < nums.length; i++) {
            // Check if the element is the firt element or if it is different of the previous number
            if (i == 0 || nums[i] != nums[i - 1]) {
                // First time this number appear and increase the length
                repeated = 1;
                length++;
            } else {
                // Number is equals to the previous number
                repeated++;
                // If this number appeared less than 3 times in the array, increase the length
                if (repeated <= 2) {
                    length++;
                }
            }
        }
    
        return length;
	}  
}
