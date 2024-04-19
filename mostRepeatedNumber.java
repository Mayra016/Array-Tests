class MostRepeatedNumber {
    public int majorityElement(int[] nums) {
        int repeated = 0;
        int maxRepeatedNum = 0;
        int maxTimes = 0;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            // If the number is the first one or is different to the previous number, than repeated will be set to 1
            if (i == 0 || nums[i] != nums[i - 1]) {
                repeated = 1;             
            } else {
            // If the number appears more than one time, it will evaluate if the times it appears is greater than the previous most repeated number  
                repeated++;
                if (repeated > maxTimes) {
                    maxTimes = repeated;
                    maxRepeatedNum = nums[i];
                }               
            }
        }

        return maxRepeatedNum;
    }
}
