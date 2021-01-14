from typing import List


class SubrectangleQueries:

    def __init__(self, rectangle: List[List[int]]):
        self.rectangle = rectangle

    def updateSubrectangle(self, row1: int, col1: int, row2: int, col2: int, newValue: int) -> None:
        for i in range(row1, row2+1):
            self.rectangle[i][col1:col2+1] = [newValue] * \
                len(self.rectangle[i][col1:col2+1])

    def getValue(self, row: int, col: int) -> int:
        return self.rectangle[row][col]


subrectangleQueries = SubrectangleQueries(
    [[1, 2, 1], [4, 3, 4], [3, 2, 1], [1, 1, 1]])
print(subrectangleQueries.rectangle)
print(subrectangleQueries.getValue(0, 2))
subrectangleQueries.updateSubrectangle(0, 0, 3, 2, 5)
print(subrectangleQueries.rectangle)
print(subrectangleQueries.getValue(0, 2))
print(subrectangleQueries.getValue(3, 1))
subrectangleQueries.updateSubrectangle(3, 0, 3, 2, 10)
print(subrectangleQueries.getValue(0, 2))
print(subrectangleQueries.getValue(3, 1))
