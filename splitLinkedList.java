public class splitLinkedList {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode[] splitListToParts(ListNode head, int k) {
        // 1. Contar el número total de nodos
        int tam = 0;
        ListNode temp = head;
        while (temp != null) {
            tam++;
            temp = temp.next;
        }
    
        // 2. Determinar el tamaño base de cada parte y cuántos grupos tendrán un nodo extra
        int sizeOfEachPart = tam / k;
        int res = tam % k;
    
        // 3. Crear el array de resultado para almacenar los k grupos
        ListNode[] result = new ListNode[k];
        ListNode current = head;
    
        // 4. Iterar sobre cada parte y dividir la lista
        for (int i = 0; i < k; i++) {
            result[i] = current; 
            int currentPartSize = sizeOfEachPart + (i < res ? 1 : 0);  
    
            
            for (int j = 0; j < currentPartSize - 1; j++) {
                if (current != null) current = current.next;
            }

            if (current != null) {
                ListNode nextPart = current.next;
                current.next = null; 
                current = nextPart;   
            }
        }
        return result;
    }
    
}
