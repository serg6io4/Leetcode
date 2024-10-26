class Solution(object):
    def rotate(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: None Do not return anything, modify matrix in-place instead.
        """
        mt = lambda m: map(list, zip(*m))
        i = 0
        for r in mt(matrix):
            matrix[i] = r
            i+=1
        i=0
        for i in range(len(matrix)):
            matrix[i].reverse()
        return matrix
    
    def rotate2(matrix):
    # Transponer la matriz (intercambiar filas por columnas)
        n = len(matrix)
        for i in range(n):
            for j in range(i, n):
                matrix[i][j], matrix[j][i] = matrix[j][i], matrix[i][j]
        
        # Invertir cada fila para completar la rotación
        for row in matrix:
            row.reverse()

solucion = Solution()
matrix = [[1,2,3],[4,5,6],[7,8,9]]
print(solucion.rotate(matrix))