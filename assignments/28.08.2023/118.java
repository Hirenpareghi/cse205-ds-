import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        if (numRows == 0) {
            return triangle;
        }

        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);

        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = triangle.get(i - 1);
            List<Integer> currentRow = new ArrayList<>();
            
            currentRow.add(1);

            for (int j = 1; j < i; j++) {
                int sum = prevRow.get(j - 1) + prevRow.get(j);
                currentRow.add(sum);
            }
            
            currentRow.add(1);
            
            triangle.add(currentRow);
        }

        return triangle;
    }

    public static void main(String[] args) {
        int numRows = 5;
        Solution solution = new Solution();
        List<List<Integer>> pascalsTriangle = solution.generate(numRows);
        

        for (List<Integer> row : pascalsTriangle) {
            System.out.println(row);
        }
    }
}

