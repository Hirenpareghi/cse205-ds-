public class Solution {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        char[] input = {'h', 'e', 'l', 'l', 'o'};
        System.out.println("Original: " + new String(input));
        
        solution.reverseString(input);
        System.out.println("Reversed: " + new String(input));
    }
}
