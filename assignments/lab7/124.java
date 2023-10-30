
class Solution {
    int maxsum;
    public int maxPathSum(TreeNode root) {
        maxsum = Integer.MIN_VALUE;
        maxPathSumUtil(root);
        return maxsum;
    }
    
    public int maxPathSumUtil(TreeNode root){
        if(root==null) return 0;
        int leftMaxSum = Math.max(0,maxPathSumUtil(root.left));
        int rightMaxSum = Math.max(0,maxPathSumUtil(root.right));
        
        maxsum = Math.max(maxsum, root.val+leftMaxSum+rightMaxSum);
        return root.val+Math.max(leftMaxSum, rightMaxSum);
    }
}