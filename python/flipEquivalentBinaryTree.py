# Definition for a binary tree node.
class TreeNode(object):
     def __init__(self, val=0, left=None, right=None):
         self.val = val
         self.left = left
         self.right = right

class Solution(object):
    def flipEquiv(self, root1, root2):
        """
        :type root1: Optional[TreeNode]
        :type root2: Optional[TreeNode]
        :rtype: bool
        """
        if(root1 is None) and (root2 is None) : return True
        if(root1 is None) or (root2 is None): return False
        if(root1.val != root2.val): return False

        #El arbol puede ser el mismo, por lo que hay que comprobarlo tal cual
        #O el arbol puede ser flipeado, en ese caso hay que comprobar en espejo

        sinFlip = self.flipEquiv(root1.left, root2.left) and self.flipEquiv(root1.right, root2.right)
        conFlip = self.flipEquiv(root1.left, root2.right) and self.flipEquiv(root1.right, root2.left)

        #Si da true en una de las dos, significa que es correcto, se habrá comprobado para todo el arbol
        return sinFlip or conFlip

# Definición de los árboles
root1 = TreeNode(1)
root1.left = TreeNode(2)
root1.right = TreeNode(3)
root1.left.left = TreeNode(4)
root1.left.right = TreeNode(5)
root1.right.left = TreeNode(6)
root1.right.right = TreeNode(7)

root2 = TreeNode(1)
root2.left = TreeNode(3)
root2.right = TreeNode(2)
root2.left.left = TreeNode(7)
root2.left.right = TreeNode(6)
root2.right.left = TreeNode(5)
root2.right.right = TreeNode(4)

# Probar la función
sol = Solution()
print(sol.flipEquiv(root1, root2))  # Debería imprimir True