# Definition for a binary tree node.
class TreeNode(object):
     def __init__(self, val=0, left=None, right=None):
         self.val = val
         self.left = left
         self.right = right


class Solution(object):
    def maxDepth(self, root):
        """
        :type root: Optional[TreeNode]
        :rtype: int
        """
        if(root is None):
            return 0
        if(root.left is None and root.right is None):
            return 1
        else:
            return 1 + max(self.maxDepth(root.right), self.maxDepth(root.left))
        
    def minDepth(self, root):
        """
        :type root: Optional[TreeNode]
        :rtype: int
        """
        if root is None:
            return 0
        # Si uno de los hijos es None, no podemos considerar ese camino como válido,
        # por lo tanto debemos considerar solo el camino que no sea None.
        if root.left is None:
            return 1 + self.minDepth(root.right)
        if root.right is None:
            return 1 + self.minDepth(root.left)
        
        # Si ambos hijos existen, tomamos el menor de los dos.
        return 1 + min(self.minDepth(root.left), self.minDepth(root.right))

nodo4 = TreeNode(4)
nodo2 = TreeNode(2, left=nodo4)
nodo3 = TreeNode(3)
nodo1 = TreeNode(1, left=nodo2, right=nodo3)

# Instanciar la solución
solucion = Solution()

# Llamar a maxDepth para encontrar la profundidad máxima del árbol
profundidad_maxima = solucion.maxDepth(nodo1)

print(f"La profundidad máxima del árbol es: {profundidad_maxima}")