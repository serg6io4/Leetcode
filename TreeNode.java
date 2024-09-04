import java.util.ArrayList;
import java.util.List;

public class TreeNode{
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

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> solucion = new ArrayList<>();
        if(root == null) return solucion;
        solucion.addAll(postorderTraversal(root.left));
        solucion.addAll(postorderTraversal(root.right));
        solucion.add(root.val);
        return solucion;
    }

    public static void main(String[] args) {
        // Caso 1: Árbol vacío
        TreeNode root1 = null;
        TreeNode tree = new TreeNode();
        List<Integer> result1 = tree.postorderTraversal(root1);
        System.out.println(result1); // Esperado: []

        // Caso 2: Árbol con un solo nodo
        TreeNode root2 = new TreeNode(1);
        List<Integer> result2 = tree.postorderTraversal(root2);
        System.out.println(result2); // Esperado: [1]

        // Caso 3: Árbol con tres nodos, uno a la izquierda y otro a la derecha
        TreeNode root3 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        List<Integer> result3 = tree.postorderTraversal(root3);
        System.out.println(result3); // Esperado: [2, 3, 1]

        // Caso 4: Árbol con múltiples niveles
        TreeNode root4 = new TreeNode(1, 
                            new TreeNode(2, new TreeNode(4), new TreeNode(5)), 
                            new TreeNode(3, null, new TreeNode(6))
                        );
        List<Integer> result4 = tree.postorderTraversal(root4);
        System.out.println(result4); // Esperado: [4, 5, 2, 6, 3, 1]

        // Caso 5: Árbol donde todos los nodos están solo a la izquierda
        TreeNode root5 = new TreeNode(1, new TreeNode(2, new TreeNode(3, new TreeNode(4), null), null), null);
        List<Integer> result5 = tree.postorderTraversal(root5);
        System.out.println(result5); // Esperado: [4, 3, 2, 1]
    }
}