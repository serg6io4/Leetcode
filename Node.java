import java.util.ArrayList;
import java.util.List;

public class Node {
    
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }

    public List<Integer> postorder(Node root) {
        List<Integer> solucion = new ArrayList<>();
        if(root == null) return solucion;
        if(root.children != null){
            for(Node x : root.children){
                solucion.addAll(postorder(x));
            }
        }
        solucion.add(root.val);
        return solucion;
    }

    // Crear el árbol n-ario basado en el ejemplo: [1,null,3,2,4,null,5,6]
    public static void main(String[] args) {
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        List<Node> childrenOf3 = new ArrayList<>();
        childrenOf3.add(node5);
        childrenOf3.add(node6);
        Node node3 = new Node(3, childrenOf3);
        Node node2 = new Node(2);
        Node node4 = new Node(4);
        List<Node> childrenOf1 = new ArrayList<>();
        childrenOf1.add(node3);
        childrenOf1.add(node2);
        childrenOf1.add(node4);
        Node root = new Node(1, childrenOf1);

        // Crear una instancia de la solución y llamar al método postorder
        Node solution = new Node();
        List<Integer> resultado = solution.postorder(root);

        // Imprimir el resultado
        System.out.println(resultado); // Debería imprimir [5, 6, 3, 2, 4, 1]
    }
}
