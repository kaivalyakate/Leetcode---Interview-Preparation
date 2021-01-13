class Node:
    def __init__(self, val=None):
        self.val = val
        self.right = None
        self.left = None


def insert(root, key):
    if root == None:
        return Node(key)
    elif root.val < key:
        root.right = insert(root.right, key)
    elif root.val > key:
        root.left = insert(root.left, key)
    return root


def inorder(root, ans=[]):
    if root == None:
        return None
    inorder(root.left, ans)
    ans.append(root.val)
    inorder(root.right, ans)
    return ans


def increase(root):
    ord1 = inorder(root)
    r1 = Node(ord1[0])
    root = r1
    i = 1
    while i < len(ord1):
        r1.right = Node(ord1[i])
        r1 = r1.right
        i += 1
    return root


nd = Node(5)
nd = insert(nd, 1)
nd = insert(nd, 7)
print(inorder(increase(nd)))
# print(nd.left)
