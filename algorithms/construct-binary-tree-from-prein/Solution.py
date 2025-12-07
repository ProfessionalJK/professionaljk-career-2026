from typing import List, Optional
from collections import deque

class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

def build_tree(preorder, inorder):
    if not preorder or not inorder:
        return None

    idx_map = {val:i for i,val in enumerate(inorder)}

    def helper(pre_lo, pre_hi, in_lo, in_hi):
        if pre_lo > pre_hi or in_lo > in_hi:
            return None
        root_val = preorder[pre_lo]
        root = TreeNode(root_val)
        in_root_idx = idx_map[root_val]
        left_size = in_root_idx - in_lo
        root.left = helper(pre_lo+1, pre_lo+left_size, in_lo, in_root_idx-1)
        root.right = helper(pre_lo+left_size+1, pre_hi, in_root_idx+1, in_hi)
        return root
    return helper(0, len(preorder)-1, 0, len(inorder)-1)

def to_level_order(root):
    if not root: return []
    q = deque([root])
    out = []
    while q:
        n = q.popleft()
        if n is None:
            out.append(None)
            continue
        out.append(n.val)
        q.append(n.left if n.left is not None else None)
        q.append(n.right if n.right is not None else None)
    while out and out[-1] is None:
        out.pop()
    return out

if __name__ == "__main__":
    tests = [
        ([], [], []),
        ([1], [1], [1]),
        ([3,9,20,15,7], [9,3,15,20,7], [3,9,20,None,None,15,7]),
        ([1,2,3], [3,2,1], [1,None,2,None,3]),
    ]
    for pre, ino, expected in tests:
        root = build_tree(pre, ino)
        out = to_level_order(root)
        print(f"pre={pre}, in={ino} -> level: {out}, expected: {expected}, OK={out==expected}")