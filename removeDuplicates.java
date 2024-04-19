import java.util.HashSet;

// Remove duplicate numbers and return the number of non duplicated elements
class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        Arrays.stream(nums)
            .forEach(n -> set.add(n));

        return set.size();   
    }
}
