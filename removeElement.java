import java.util.Arrays;

// Remove matching element and return the number of non matching elements
class removeElement {
    public int removeElement(int[] nums, int val) {
        nums = Arrays.stream(nums)
            .filter(n -> n != val)
            .toArray();    

        return nums.length;      
    }
}
