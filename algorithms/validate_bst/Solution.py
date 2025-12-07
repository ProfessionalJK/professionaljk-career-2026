class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

def validate_bst(root):
    return helper(root, float('-inf'), float('inf'))

def helper(node, min_exclusive, max_exclusive):
    if node is None:
        return True
    val = node.val
    if val <= min_exclusive or val >= max_exclusive:
        return False
    return helper(node, min_exclusive, val) and helper(node, val, max_exclusive)

node = TreeNode(5)
node.left = TreeNode(1)
node.right = TreeNode(4)
node.right.left = TreeNode(3)
node.right.right = TreeNode(6)
print(validate_bst(node))