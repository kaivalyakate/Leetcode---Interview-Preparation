# Definition for a binary tree node.
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def increasingBST(self, root: TreeNode) -> TreeNode:
        global roots
        roots = root
        global first
        global joiner
        joiner = None
        first = 1

        def helper(nde):
            global first
            global roots
            global joiner
            if nde.left:
                helper(nde.left)
            if first:
                roots = nde
                joiner = nde
                first = 0
            else:
                nde.left = None
                joiner.right = nde
                joiner = nde
            if nde.right:
                helper(nde.right)

        helper(roots)
        return roots
