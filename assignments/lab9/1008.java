class Solution {
 public TreeNode bstFromPreorder(int[] preorder) 
 {
     TreeNode root= new TreeNode(preorder[0]);
     for(int i: preorder)
     {
         helper(i,root);
     }
     return root ;
 }
    public TreeNode helper(int i, TreeNode root)
    { 
        if(root==null){
 root =new TreeNode (i);
        return root;
        }
     if(i<root.val){
         root.left= helper(i,root.left);
     }
     if(i>root.val){
         root.right=helper(i, root.right);
     }
        return root;
    }
}