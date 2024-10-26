class SubrectangleQueries(object):

    def __init__(self, rectangle):
        """
        :type rectangle: List[List[int]]
        """
        self.rectangle = rectangle
        

    def updateSubrectangle(self, row1, col1, row2, col2, newValue):
        """
        :type row1: int
        :type col1: int
        :type row2: int
        :type col2: int
        :type newValue: int
        :rtype: None
        """
        for i in range(row1, row2+1):
            for j in range(col1, col2+1):
                self.rectangle[i][j] = newValue
        

    def getValue(self, row, col):
        """
        :type row: int
        :type col: int
        :rtype: int
        """
        return self.rectangle[row][col]
        


# Your SubrectangleQueries object will be instantiated and called as such:
# obj = SubrectangleQueries(rectangle)
# obj.updateSubrectangle(row1,col1,row2,col2,newValue)
# param_2 = obj.getValue(row,col)
# Example usage

if __name__ == "__main__":
    # Example 1
    subrectangleQueries = SubrectangleQueries([[1, 2, 1], [4, 3, 4], [3, 2, 1], [1, 1, 1]])
    print(subrectangleQueries.getValue(0, 2))  # Output: 1
    subrectangleQueries.updateSubrectangle(0, 0, 3, 2, 5)  # Updates the entire rectangle to 5
    print(subrectangleQueries.getValue(0, 2))  # Output: 5
    print(subrectangleQueries.getValue(3, 1))  # Output: 5
    subrectangleQueries.updateSubrectangle(3, 0, 3, 2, 10)  # Updates the last row to 10
    print(subrectangleQueries.getValue(3, 1))  # Output: 10
    print(subrectangleQueries.getValue(0, 2))  # Output: 5