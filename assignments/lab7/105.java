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
class Solution {
    public TreeNode construct(int[] pre,int psi,int pei,int[] in,int isi,int iei){
        if(psi>pei || isi>iei){
            return null;
        }
        TreeNode root=new TreeNode(pre[psi]);
        int ct=0;
        int itr=isi;
        while(in[itr]!=root.val){
            ct++;
            itr++;
        }
        TreeNode lst=construct(pre,psi+1,psi+ct,in,isi,itr-1);
        TreeNode rst=construct(pre,psi+ct+1,pei,in,itr+1,iei);

        root.left=lst;
        root.right=rst;

        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return construct(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
    }
}