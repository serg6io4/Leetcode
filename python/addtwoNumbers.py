# Definition for singly-linked list.

class ListNode(object):
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution(object):
    def addTwoNumbers(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        dummy = ListNode(0)
        current = dummy
        acarreo = 0
        while l1 or l2 or acarreo:
            val1 = l1.val if l1 else 0
            val2 = l2.val if l2 else 0

            total = val1 + val2 + acarreo
            acarreo = total // 10
            current.next = ListNode(total%10)
            current = current.next

            if l1:
                l1 = l1.next
            if l2:
                l2 = l2.next

        return dummy.next

l1 = ListNode(2, ListNode(4, ListNode(3)))  # Representa 342
l2 = ListNode(5, ListNode(6, ListNode(4)))  # Representa 465

# Crear una instancia de la clase Solution
solucion = Solution()

# Llamar al método addTwoNumbers
resultado = solucion.addTwoNumbers(l1, l2)

# Función para imprimir la lista enlazada
def imprimir_lista(lista):
    while lista:
        print(lista.val, end=" -> " if lista.next else "\n")
        lista = lista.next

# Imprimir el resultado
imprimir_lista(resultado)


        