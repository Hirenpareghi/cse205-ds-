public class Solution {
    public int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 6; // Replace with the desired value of n
        int result = solution.fib(n);
        System.out.println("F(" + n + ") = " + result);
    }
}
