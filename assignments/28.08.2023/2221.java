public class Solution {
    public int triangularSum(int[] nums) {
        while (nums.length > 1) {
            int n = nums.length;
            int[] newNums = new int[n - 1];
            for (int i = 0; i < n - 1; i++) {
                newNums[i] = (nums[i] + nums[i + 1]) % 10;
            }
            nums = newNums;
        }
        return nums[0];
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        Solution solution = new Solution();
        int result = solution.triangularSum(nums);
        System.out.println("Triangular Sum: " + result);
    }
}
