class BSTIterator {
  Stack<TreeNode> stack;

  public BSTIterator(TreeNode root) {
    stack = new Stack<>();

    for (var a = root; a != null; a = a.left)
      stack.push(a);
  }
  
  public int next() {
    var node = stack.pop();

    for (var a = node.right; a != null; a = a.left)
      stack.push(a);

    return node.val;
  }
  
  public boolean hasNext() {
    return !stack.empty();  
  }
}