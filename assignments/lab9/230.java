/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class Solution {
    private Pair<Integer, Integer> morris(TreeNode cur, int k) {
        int ans = 0, cnt = 0;
        while (cur != null) {
            if (cur.left == null) {
                k--;
                cnt++;
                cur = cur.right;
            } else {
                TreeNode prev = cur.left;
                while (prev.right != null && prev.right != cur) {
                    prev = prev.right;
                }
                if (prev.right == null) {
                    prev.right = cur;
                    cur = cur.left;
                } else {
                    prev.right = null;
                    k--;
                    cnt++;
                    cur = cur.right;
                }
            }
            if (k == 1) ans = cur.val;
        }
        return new Pair<>(ans, cnt);
    }

    private int inorder(TreeNode root, int k) {
        if (k == 1 && root.left == null) return root.val;
        Pair<Integer, Integer> pr = morris(root, k);
        return pr.getKey();
    }

    public int kthSmallest(TreeNode root, int k) {
        return inorder(root, k);
    }

    public int kthLargest(TreeNode root, int k) {
        Pair<Integer, Integer> pr = morris(root, k);
        int newK = pr.getValue() - k + 1;
        return inorder(root, newK);
    }
}
