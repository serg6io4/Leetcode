public class mergeSortedList {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0); // Nodo dummy para simplificar la fusión
        ListNode tail = dummy; // Puntero para construir la lista fusionada
        while(list1 !=null && list2 !=null){
            if(list1.val< list2.val){
                tail.next = list1;
                list1 = list1.next;
            }else{
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }
        if(list1 != null){
        tail.next = list1;
        }
        if(list2 != null){
            tail.next = list2;
        }
         return dummy.next;
    }

    public static void printList(ListNode node) {
        if (node == null) {
            System.out.println("null");
            return;
        }
        while (node != null) {
            System.out.print(node.val);
            if (node.next != null) {
                System.out.print(" -> ");
            }
            node = node.next;
        }
        System.out.println();
    }

    // Función para crear una lista enlazada desde un array
    public ListNode createList(int[] values) {
        if (values.length == 0) return null;
        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }
        return head;
    }

    public static void main(String[] args) {
        mergeSortedList solution = new mergeSortedList();
        
        // Crear listas enlazadas de prueba
        int[] values1 = {1, 3, 5, 7};
        int[] values2 = {2, 4, 6, 8, 10};
        
        ListNode list1 = solution.createList(values1);
        ListNode list2 = solution.createList(values2);
        
        // Fusionar las dos listas
        ListNode mergedList = solution.mergeTwoLists(list1, list2);
        
        // Imprimir la lista fusionada
        System.out.print("Merged List: ");
        printList(mergedList);
    }
}
