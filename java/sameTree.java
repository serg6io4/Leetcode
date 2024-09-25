public class sameTree {

  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
  
  public boolean isSameTree(TreeNode p, TreeNode q) {
    if(p==null && q==null) return true;
    if(p==null || q==null) return false;
    if(p.val != q.val) return false;
    return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
  }

  public static void main(String[] args) {
    sameTree st = new sameTree();
    TreeNode tree1 = st.new TreeNode(1, st.new TreeNode(2), st.new TreeNode(3));
    TreeNode tree2 = st.new TreeNode(1, st.new TreeNode(2), st.new TreeNode(3));
    TreeNode tree3 = st.new TreeNode(1, st.new TreeNode(2), st.new TreeNode(4));

    // Caso 1: Comparando dos árboles idénticos
    System.out.println(st.isSameTree(tree1, tree2)); // Debería imprimir true

    // Caso 2: Comparando dos árboles diferentes
    System.out.println(st.isSameTree(tree1, tree3)); // Debería imprimir false

    // Caso 3: Comparando un árbol con null
    System.out.println(st.isSameTree(tree1, null)); // Debería imprimir false

    // Caso 4: Comparando dos nulls
    System.out.println(st.isSameTree(null, null)); // Debería imprimir true
}

}
