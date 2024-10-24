# Definition for singly-linked list.
class ListNode(object):
     def __init__(self, val=0, next=None):
         self.val = val
         self.next = next

class Solution(object):
    def insertionSortList(self, head):
        """
        :type head: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        dummy = ListNode(0)
        
        current = head

        while current:
            
            prev = dummy
            while(prev.next and prev.next.val < current.val):
                prev = prev.next
            
            #Con esto nos aseguramos que no se corte la lista
            temp = current.next
            current.next = prev.next
            prev.next = current
            current = temp
        return dummy.next
