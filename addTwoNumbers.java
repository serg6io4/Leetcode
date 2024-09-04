package resueltos;

class Solution {

    public class ListNode {
        int val;
        ListNode next;
        //Este método crea un nodo de una linked list vacia
        ListNode() {

        }
        //Crea un nodo de una linked list con un valor, sin siguiente
        ListNode(int val) {
            this.val = val;
        }
        //Crea un nodo con un valor y un siguiente nodo
        ListNode(int val, ListNode next) {
            this.val = val; this.next = next; 
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode nodoCabeza = new ListNode(0);
        ListNode solucion = nodoCabeza;
        int acarreo = 0;
        while(l1.next != null || l2.next != null || acarreo !=0){
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;
            int sum = val1 + val2 + acarreo;
            acarreo = sum/10;
            int digit = sum%10;
            solucion.next = new ListNode(digit);
            solucion = solucion.next;
            if(l1.next != null) l1 = l1.next;
            if(l2.next != null) l2 = l2.next;
        }
        return nodoCabeza.next;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Caso de prueba 1: (2 -> 4 -> 3) + (5 -> 6 -> 4) = 7 -> 0 -> 8
        Solution.ListNode l1 = solution.new ListNode(2, solution.new ListNode(4, solution.new ListNode(3)));
        Solution.ListNode l2 = solution.new ListNode(5, solution.new ListNode(6, solution.new ListNode(4)));

        Solution.ListNode result = solution.addTwoNumbers(l1, l2);
        printList(result);  // Esperado: 7 -> 0 -> 8

        // Caso de prueba 2: (9 -> 9) + (1) = 0 -> 0 -> 1
        l1 = solution.new ListNode(9, solution.new ListNode(9));
        l2 = solution.new ListNode(1);

        result = solution.addTwoNumbers(l1, l2);
        printList(result);  // Esperado: 0 -> 0 -> 1

        // Caso de prueba 3: (9 -> 9 -> 9) + (1) = 0 -> 0 -> 0 -> 1
        l1 = solution.new ListNode(9, solution.new ListNode(9, solution.new ListNode(9)));
        l2 = solution.new ListNode(1);

        result = solution.addTwoNumbers(l1, l2);
        printList(result);  // Esperado: 0 -> 0 -> 0 -> 1
    }

    public static void printList(Solution.ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }
}
