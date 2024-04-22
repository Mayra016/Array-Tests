import java.util.Arrays;

class MinJumpingArraysMoves {
    public int jump(int[] nums) {
        int[] movements = new int[nums[0] + 1];
        int x = 1;

        if (nums[0] == 0 || nums[0] >= nums.length && nums.length == 1) {
            return 0;
        }

        if (nums[0] >= nums.length) {
            return 1;
        }

        while (x <= nums[0]) {
            int k = x;
            movements[x] = 0;

            while ( k <= nums.length && nums[k] != 0 ) {
                movements[x] = movements[x] + 1;
                k = k + nums[k];
            }
     
            if ( k < nums.length && nums[k] == 0 ) {
                movements[x] = 0;
            }
            
            x = x + 1;
        }

        Arrays.sort(movements);
        
        for (int i = 0; i < movements.length; i++) {
            if (movements[i] != 0) {
                return movements[i];
            } 
        }

        return movements[1];
    }
}
