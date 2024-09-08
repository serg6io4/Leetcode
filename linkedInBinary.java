public class linkedInBinary {

    //Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    //Definition for a binary tree node.
    public static class TreeNode {
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

    public boolean isSubPath(ListNode head, TreeNode root) {
        if (root == null) {
            return false; 
        }
        return dfs(head, root) || isSubPath(head, root.left) || isSubPath(head, root.right);
    }

    private boolean dfs(ListNode head, TreeNode root) {
        if (head == null) {
            return true;
        }
        if (root == null) {
            return false; 
        }
        if (head.val == root.val) {
            return dfs(head.next, root.left) || dfs(head.next, root.right);
        }

        return false; 
    }

    public static void main(String[] args) {
        // Crear la lista enlazada [4,2,8]
        ListNode head = new ListNode(4);
        head.next = new ListNode(2);
        head.next.next = new ListNode(8);
    
        // Crear el árbol binario [1,4,4,null,2,2,null,1,null,6,8,null,null,null,null,1,3]
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(4);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(2);
        root.left.right.left = new TreeNode(1);
        root.left.right.left.right = new TreeNode(6);
        root.left.right.left.right.right = new TreeNode(8);
        root.left.right.left.right.right.left = new TreeNode(1);
        root.left.right.left.right.right.right = new TreeNode(3);
    
        // Crear instancia de la clase y llamar al método isSubPath
        linkedInBinary solution = new linkedInBinary();
        boolean result = solution.isSubPath(head, root);
    
        // Imprimir el resultado
        System.out.println("Output: " + result);
    }
}
