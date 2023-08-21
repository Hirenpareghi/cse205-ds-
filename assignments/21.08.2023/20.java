import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, new StringBuilder(), n, n);
        return result;
    }

    private void backtrack(List<String> result, StringBuilder current, int open, int close) {
        if (open == 0 && close == 0) {
            result.add(current.toString());
            return;
        }
        if (open > 0) {
            current.append("(");
            backtrack(result, current, open - 1, close);
            current.deleteCharAt(current.length() - 1);
        }
        if (close > open) {
            current.append(")");
            backtrack(result, current, open, close - 1);
            current.deleteCharAt(current.length() - 1);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 3;
        List<String> combinations = solution.generateParenthesis(n);
        for (String combination : combinations) {
            System.out.println(combination);
        }
    }
}
