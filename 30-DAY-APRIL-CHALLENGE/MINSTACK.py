class MinStack:

    def __init__(self):
        """
        initialize your data structure here.
        """
        self.stack = []
        self.min = []

    def push(self, x: int) -> None:
        if self.stack == []:
            self.min.append(x)
            self.stack.append(x)
        else:
            if x <= self.min[-1]:
                self.min.append(x)
            self.stack.append(x)

    def pop(self) -> None:
        if self.stack[-1] == self.min[-1]:
            self.min.pop(-1)
        elif self.stack == []:
            return None
        self.stack.pop(-1)

    def top(self) -> int:
        if self.stack == []:
            return None
        return self.stack[-1]

    def getMin(self) -> int:
        if self.stack == []:
            return None
        elif self.min == []:
            return None
        return self.min[-1]

        # Your MinStack object will be instantiated and called as such:


obj = MinStack()
obj.push(0)
obj.push(1)
obj.push(0)
print(obj.getMin())
obj.pop()
print(obj.getMin())
