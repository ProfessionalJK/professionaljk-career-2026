from collections import deque
from typing import Optional, List

class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

def build_tree_from_list(vals):
    if not vals: return None
    it = iter(vals)
    root_val = next(it)
    if root_val is None: return None
    root = TreeNode(root_val)
    q = deque([root])
    while True:
        try:
            node = q.popleft()
        except IndexError:
            break
        try: v = next(it)
        except StopIteration: break
        if v is not None:
            node.left = TreeNode(v); q.append(node.left)
        try: v = next(it)
        except StopIteration: break
        if v is not None:
            node.right = TreeNode(v); q.append(node.right)
    return root

def kth_smallest(root, k):
    stack = []
    curr = root
    cnt = 0
    while curr or stack:
        while curr:
            stack.append(curr)
            curr = curr.left
        curr = stack.pop()
        cnt += 1
        if cnt == k:
            return curr.val
        curr = curr.right
    raise ValueError("k is out of bounds")

if __name__ == "__main__":
    tests = [
        ([3,1,4,None,2], 1, 1),
        ([3,1,4,None,2], 2, 2),
        ([3,1,4,None,2], 3, 3),
        ([5,3,6,2,4,None,None,1], 3, 3),
        ([2,1], 2, 2)
    ]
    for arr,k,expected in tests:
        root = build_tree_from_list(arr)
        out = kth_smallest(root, k)
        print(f"arr={arr}, k={k} -> {out} expected={expected}")