# Definition for a binary tree node.
class TreeNode(object):
     def __init__(self, val=0, left=None, right=None):
         self.val = val
         self.left = left
         self.right = right

class Solution(object):
    def hasPathSum(self, root, targetSum):
        """
        :type root: Optional[TreeNode]
        :type targetSum: int
        :rtype: bool
        """
        if(root is None):
            return False
        if(root.left is None and root.right is None):
            return targetSum == root.val
        
        return self.hasPathSum(root.left, targetSum - root.val) or self.hasPathSum(root.right, targetSum-root.val)


nodo4 = TreeNode(4)
nodo2 = TreeNode(2, left=nodo4)
nodo3 = TreeNode(3)
nodo1 = TreeNode(1, left=nodo2, right=nodo3)

# Instanciar la solución
solucion = Solution()

# Llamar a maxDepth para encontrar la profundidad máxima del árbol
existe = solucion.hasPathSum(nodo1, 7)

print(existe)
