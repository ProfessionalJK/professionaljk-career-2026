
from collections import deque
from typing import Optional, List

class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

def build_tree_from_list(vals):
    if not vals:
        return None
    it = iter(vals)
    root_val = next(it)
    if root_val is None:
        return None
    root = TreeNode(root_val)
    q = deque([root])
    while True:
        try:
            node = q.popleft()
        except IndexError:
            break
        try:
            v = next(it)
        except StopIteration:
            break
        if v is not None:
            node.left = TreeNode(v); q.append(node.left)
        try:
            v = next(it)
        except StopIteration:
            break
        if v is not None:
            node.right = TreeNode(v); q.append(node.right)
    return root

def has_path_sum(root, target):
    if not root:
        return False
    # DFS recursion
    def dfs(node, current):
        if not node:
            return False
        current += node.val
        # if leaf
        if node.left is None and node.right is None:
            return current == target
        return dfs(node.left, current) or dfs(node.right, current)
    return dfs(root, 0)

# quick tests
if __name__ == "__main__":
    tests = [
        ([], 0, False),
        ([1], 1, True),
        ([1], 2, False),
        ([5,4,8,11,None,13,4,7,2,None,None,None,1], 22, True),
        ([1,2,3], 5, False),
        ([1,2,3], 3, True), # path 1->2 = 3
        ([1,2], 1, False),
        ([-2,None,-3], -5, True),
    ]
    for arr, target, expected in tests:
        root = build_tree_from_list(arr)
        out = has_path_sum(root, target)
        print(f"in: {arr}, target={target} -> {out} expected {expected}")