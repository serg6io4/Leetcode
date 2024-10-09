
public class rotateList {
    
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        int size = 0;
        ListNode current = head;
        while(current != null){
            size++;
            current = current.next;
        }
        //Movimientos totales
        k = k % size;
        if(k == 0){
            return head;
        }

        ListNode tail = head;
        for(int i= 0; i < size; i++){
            tail = tail.next;
        }
        tail.next = head; //Conecto el final con el principio

        ListNode newHead = head;
        for (int i = 0; i < size - k - 1; i++) {
            newHead = newHead.next; // Avanza hasta la nueva cabeza
        }

        // 6. Cortar la conexión y devolver la nueva cabeza
        ListNode rotatedHead = newHead.next;
        newHead.next = null; // Termina la lista en el nuevo tail
        return rotatedHead;
    }
}
