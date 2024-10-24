# Definition for a binary tree node.
class TreeNode(object):
     def __init__(self, val=0, left=None, right=None):
         self.val = val
         self.left = left
         self.right = right

class Solution(object):
    def invertTree(self, root):
        """
        :type root: Optional[TreeNode]
        :rtype: Optional[TreeNode]
        """
        if(root is None): return None
        #Swap
        root.left, root.right = root.right, root.left
        
        self.invertTree(root.right)
        self.invertTree(root.left)

        return root

import unittest

class TestInvertTree(unittest.TestCase):
    def tree_to_list(self, root):
        """Convierte un árbol binario en una lista de niveles para fácil comparación."""
        if not root:
            return []
        result, queue = [], [root]
        while queue:
            node = queue.pop(0)
            if node:
                result.append(node.val)
                queue.append(node.left)
                queue.append(node.right)
            else:
                result.append(None)
        # Elimina los valores None redundantes del final
        while result and result[-1] is None:
            result.pop()
        return result
    def test_invertTree(self):
        root = TreeNode(4)
        root.left = TreeNode(2)
        root.right = TreeNode(7)
        root.left.left = TreeNode(1)
        root.left.right = TreeNode(3)
        root.right.left = TreeNode(6)
        root.right.right = TreeNode(9)

        # Árbol esperado después de invertir
        expected = [4, 7, 2, 9, 6, 3, 1]

        # Llamar a la función para invertir el árbol
        solution = Solution()
        inverted_root = solution.invertTree(root)

        # Convertir el árbol invertido en una lista para fácil comparación
        inverted_tree_list = self.tree_to_list(inverted_root)

        # Verificar que el árbol invertido sea el esperado
        self.assertEqual(inverted_tree_list, expected)

if __name__ == '__main__':
    unittest.main()


        