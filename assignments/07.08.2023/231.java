public class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int num1 = 16;
        System.out.println(num1 + " is a power of two: " + solution.isPowerOfTwo(num1));
        
        int num2 = 18;
        System.out.println(num2 + " is a power of two: " + solution.isPowerOfTwo(num2));
    }
}
