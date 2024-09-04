public class symmetricTree {
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
        
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode l1, TreeNode l2) {
        if(l1 == null && l2 == null) return true;
        if(l1 == null || l2 == null) return false;
        if(l1.val != l2.val) return false;
        return isMirror(l1.left, l2.right) && isMirror(l1.right, l2.left);
    }

    public static void main(String[] args) {
        symmetricTree st = new symmetricTree();
        // Construir un árbol simétrico
        TreeNode root = st.new TreeNode(1,
            st.new TreeNode(2, st.new TreeNode(3), st.new TreeNode(4)),
            st.new TreeNode(2, st.new TreeNode(4), st.new TreeNode(3))
        );

        // Construir un árbol no simétrico
        TreeNode nonSymmetricRoot = st.new TreeNode(1,
            st.new TreeNode(2, st.new TreeNode(3), null),
            st.new TreeNode(2, null, st.new TreeNode(3))
        );

        // Verificar simetría
        System.out.println(st.isSymmetric(root)); // Debería imprimir true
        System.out.println(st.isSymmetric(nonSymmetricRoot)); // Debería imprimir false
    }
}
