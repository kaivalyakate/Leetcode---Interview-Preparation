class TreeNode:
    def __init__(self, val, left=None, right=None) -> None:
        self.val = val
        self.left = left
        self.right = right


class Tree:

    def __init__(self, node=None):
        self.root = node

    def add(self, node: TreeNode):
        if self.root == None:
            self.root = node
        else:
            temp = self.root
            if temp.left == None and node.val < temp.val:
                temp.left = node
                return
            elif temp.right == None and node.val > temp.val:
                temp.right = node
                return
            while temp != None:
                if node.val < temp.val:                                            # CODE FOR BINARY SEARCH TREE
                    if temp.left == None:
                        temp.left = node
                        break
                    else:
                        temp = temp.left
                else:
                    if temp.right == None:
                        temp.right = node
                        break
                    else:
                        temp = temp.right

    def max_ht(self, temp):
        if temp == None:
            return 0
        return 1+max(self.max_ht(temp.left), self.max_ht(temp.right))

    def diameter(self, temp):
        if temp == None:
            return 0
        left = self.max_ht(temp.left)
        right = self.max_ht(temp.right)
        return left+right


tree = Tree(TreeNode(7))
tree.add(TreeNode(8))
tree.add(TreeNode(9))
tree.add(TreeNode(10))
tree.add(TreeNode(11))
tree.add(TreeNode(12))
tree.add(TreeNode(13))
print(tree.diameter(tree.root))
