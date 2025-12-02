class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

def inorder_helper(node, res):
    if node is None:
        return
    inorder_helper(node.left, res)
    res.append(node.val)
    inorder_helper(node.right, res)

def inorder_recursive(root):
    result = []
    inorder_helper(root, result)
    return result

def inorder_iterative(root):
    result = []
    stack = []
    current = root
    while current or stack:
        while current:
            stack.append(current)
            current = current.left
        current = stack.pop()
        result.append(current.val)
        current = current.right
    return result

node = TreeNode(1)
node.right = TreeNode(2)
node.right.left = TreeNode(3)
print(inorder_recursive(node))
print(inorder_iterative(node))