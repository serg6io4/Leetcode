import java.util.ArrayList;
import java.util.List;

public class transversalOrder {
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

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        levelOrderHelper(root, 0, result);
        return result;
    }

    private void levelOrderHelper(TreeNode node, int level, List<List<Integer>> result) {
        if (node == null) {
            return;
        }

        // Asegurarse de que haya una lista para el nivel actual
        if (result.size() == level) {
            result.add(new ArrayList<>());
        }

        // Agregar el valor del nodo al nivel correspondiente
        result.get(level).add(node.val);

        // Llamada recursiva para los nodos hijos
        levelOrderHelper(node.left, level + 1, result);
        levelOrderHelper(node.right, level + 1, result);
    }

    public static void main(String[] args) {
        transversalOrder tlo = new transversalOrder();
        // Construir un árbol de ejemplo
        TreeNode root = tlo.new TreeNode(1,
            tlo.new TreeNode(2, tlo.new TreeNode(4), tlo.new TreeNode(5)),
            tlo.new TreeNode(3, null, tlo.new TreeNode(6))
        );

        List<List<Integer>> levels = tlo.levelOrder(root);
        System.out.println(levels); // Debería imprimir [[1], [2, 3], [4, 5, 6]]
    }
}
