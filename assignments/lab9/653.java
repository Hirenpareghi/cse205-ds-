class Solution {
    public boolean findTarget(TreeNode root, int k) {
            List<Integer> lst = new ArrayList<>();
            inorder(root, lst);
            int i = 0, j = lst.size()-1;
            while(i < j){
                int currSum = lst.get(i) + lst.get(j);
                if(currSum == k){
                    return true;
                }
                if(currSum <= k){
                    
                    i++;
                }
                else{
                    j--;
                }
            }
            return false;
    }

    public void inorder(TreeNode root,List<Integer> lst){
            if(root == null){
                return ;
            }
            inorder(root.left, lst);
            lst.add(root.val);
            inorder(root.right, lst);
    }
}