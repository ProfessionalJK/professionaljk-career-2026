class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

def right_side_of_dfs(root):
    result = []
    dfs(root, 0, result)
    return result

def dfs(node, level, res):
    if node is None:
        return
    if level == len(res):
        res.append(node.val)
    dfs(node.right, level + 1, res)
    dfs(node.left, level + 1, res)

node = TreeNode(1)
node.left = TreeNode(2)
node.right = TreeNode(3)
node.left.left = TreeNode(4)
print(right_side_of_dfs(node))