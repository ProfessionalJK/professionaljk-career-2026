class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

def is_valid_bst(root):
    return helper(root, float('-inf'), float('inf'))

def helper(root, min_exclusive, max_exclusive):
    if root is None:
        return True
    if not (min_exclusive < root.val and root.val < max_exclusive):
        return False
    return helper(root.left, min_exclusive, root.val) and helper(root.right, root.val, max_exclusive)

node = TreeNode(5)
node.left = TreeNode(3)
node.left.left = TreeNode(1)
node.left.right = TreeNode(4)
node.right = TreeNode(9)
node.right.left = TreeNode(7)
node.right.right = TreeNode(10)
print(is_valid_bst(node))