public class mergeKSortedLinkList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        ListNode mergedList = lists[0];
        for (int i = 1; i < lists.length; i++) {
            mergedList = mergeTwoLists(mergedList, lists[i]);
        }
        return mergedList;
    }
    private ListNode mergeTwoLists(ListNode list1, ListNode list2) {
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

    private void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        mergeKSortedLinkList solution = new mergeKSortedLinkList();
        
        // Crear listas de prueba
        ListNode list1 = solution.new ListNode(1, solution.new ListNode(4, solution.new ListNode(5)));
        ListNode list2 = solution.new ListNode(1, solution.new ListNode(3, solution.new ListNode(4)));
        ListNode list3 = solution.new ListNode(2, solution.new ListNode(6));
        
        ListNode[] lists = {list1, list2, list3};
        
        // Fusionar listas
        ListNode mergedList = solution.mergeKLists(lists);
        
        // Imprimir la lista fusionada
        System.out.println("Merged List:");
        solution.printList(mergedList);
    }
}
