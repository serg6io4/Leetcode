import java.util.HashSet;

public class deleteNodes {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

       
    public ListNode modifiedList(int[] nums, ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode previous = dummy;
        ListNode current = head;
        HashSet<Integer> numeros = new HashSet();
        for(int i: nums){
            numeros.add(i);
        }

        while(current != null){
            boolean borrar = false;
            if(numeros.contains(current.val)){
                borrar = true;   
            }

            if(borrar){
                previous.next = current.next;
            }else{
                previous = current;
            }

            current = current.next;
        }
        
        return dummy.next;
    }
    public static void main(String[] args) {
        // Crear una instancia de la clase deleteNodes
        deleteNodes dn = new deleteNodes();

        // Crear una lista enlazada: 1 -> 2 -> 3
        ListNode head = dn.new ListNode(1);
        head.next = dn.new ListNode(2);
        head.next.next = dn.new ListNode(3);

        // Array de valores a eliminar
        int[] nums = {2};

        // Imprimir la lista original
        System.out.println("Lista original:");
        printList(head);

        // Modificar la lista eliminando los nodos que tienen valores en el array nums
        ListNode modifiedHead = dn.modifiedList(nums, head);

        // Imprimir la lista modificada
        System.out.println("Lista modificada:");
        printList(modifiedHead);
    }

    // Método auxiliar para imprimir la lista enlazada
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
       
}
