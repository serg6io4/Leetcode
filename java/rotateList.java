
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
    
        // 1. Determine the size of the list
        int size = 0;
        ListNode current = head;
        while (current != null) {
            size++;
            current = current.next;
        }
    
        // 2. Compute the effective number of rotations
        k = k % size;
        if (k == 0) {
            return head; // No need to rotate
        }
    
        // 3. Find the last node
        ListNode tail = head;
        for (int i = 0; i < size - 1; i++) { // Stop at the last node
            tail = tail.next;
        }
        tail.next = head; // Connect the last node to the head
    
        // 4. Find the new head (size - k - 1 from the start)
        ListNode newHead = head;
        for (int i = 0; i < size - k - 1; i++) {
            newHead = newHead.next; // Move to the new head
        }
    
        // 5. Break the circular list
        ListNode rotatedHead = newHead.next;
        newHead.next = null; // Cut the connection
    
        return rotatedHead;
    }
    
}
