import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        generateSubsets(nums, 0, new ArrayList<>(), result);
        return result;
    }

    private void generateSubsets(int[] nums, int index, List<Integer> current, List<List<Integer>> result) {
        if (index == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }
        
        // Include the current element in the subset
        current.add(nums[index]);
        generateSubsets(nums, index + 1, current, result);
        
        // Exclude the current element from the subset
        current.remove(current.size() - 1);
        generateSubsets(nums, index + 1, current, result);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3};
        List<List<Integer>> subsets = solution.subsets(nums);
        
        for (List<Integer> subset : subsets) {
            System.out.println(subset);
        }
    }
}
