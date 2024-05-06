class FindSum {
    /* more efficient way  
      The arrays of the problem are always crescent ordered. So if the sum is lesser than the target the left number
      must be greater. And if the sum is greater than the target, the rigth number must be reduced.
    */
    public int[] sum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[] {left + 1, right + 1};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[] {0};
    }

    // It is lesser efficient, because it needs to compare all possible numbers combinations to find the solution.  
    public int[] sumFor(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            for (int x = 1; x < numbers.length; x++) {
                if (numbers[i] + numbers[x] == target && i != x) {
                    return new int[] {i + 1, x + 1};
                }
            }
        }

        return new int[] {0};
    }
}
