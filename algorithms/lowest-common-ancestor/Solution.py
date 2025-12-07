from collections import deque

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

def find_node(root, val):
    cur = root
    while cur:
        if val == cur.val:
            return cur
        elif val < cur.val:
            cur = cur.left
        else:
            cur = cur.right
    return None

def lowest_common_ancestor(root, p, q):
    cur = root
    pv, qv = p.val, q.val

    while cur:
        if pv < cur.val and qv < cur.val:
            cur = cur.left
        elif pv > cur.val and qv > cur.val:
            cur = cur.right
        else:
            return cur
    return None

if __name__ == "__main__":
    tests = [
        ([6,2,8,0,4,7,9,None,None,3,5], 2, 8, 6),
        ([6,2,8,0,4,7,9,None,None,3,5], 2, 4, 2),
        ([2,1], 1, 2, 2),
        ([5,3,6,2,4,None,None,1], 1, 4, 3),
        ([1], 1, 1, 1)
    ]
    for arr, pv, qv, expected in tests:
        root = build_tree_from_list(arr)
        p = find_node(root, pv)
        q = find_node(root, qv)
        out = lowest_common_ancestor(root, p, q)
        print(f"tree={arr}, p={pv}, q={qv} -> LCA={out.val if out else None} expected={expected}")