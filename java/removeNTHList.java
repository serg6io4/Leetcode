public class removeNTHList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Creamos un dummy node que apunta al head, para manejar el caso de eliminar el primer nodo
        ListNode dummy = new ListNode(0, head);
        ListNode first = dummy;
        ListNode second = dummy;
        //Vamos a recorrer el nodo hasta dejarlo en n, y luego con otro nodo iremos iterando
        //hasta que el primero tenga null como siguiente, al hacer eso llevamos second a una 
        //posicion antes de la enésima y entonces apuntamos al siguiente del siguiente.
        for (int i = 0; i <= n; i++) {
            first = first.next;
        }
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return dummy.next;
    }

    public static void main(String[] args) {
        removeNTHList removeNthList = new removeNTHList();
        removeNTHList.ListNode head = removeNthList.new ListNode(1);
        head.next = removeNthList.new ListNode(2);
        head.next.next = removeNthList.new ListNode(3);
        head.next.next.next = removeNthList.new ListNode(4);
        head.next.next.next.next = removeNthList.new ListNode(5);
        
        int n = 2; // Queremos eliminar el nodo en la posición 2 desde el final (el nodo con valor 4)

        // Imprimir la lista antes de la eliminación
        printList(head);
        
        // Eliminar el nodo
        removeNTHList.ListNode result = removeNthList.removeNthFromEnd(head, n);

        // Imprimir la lista después de la eliminación
        printList(result);
    }

    // Función para imprimir la lista enlazada
    public static void printList(removeNTHList.ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
}
