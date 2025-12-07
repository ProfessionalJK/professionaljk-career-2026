import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int v){ this.val = v; }
}

public class Solution {

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int pv = p.val, qv = q.val;
        TreeNode cur = root;
        while (cur != null) {
            if (pv < cur.val && qv < cur.val) cur = cur.left;
            else if (pv > cur.val && qv > cur.val) cur = cur.right;
            else return cur;
        }
        return null;
    }

    public static TreeNode buildTree(List<Integer> vals) {
        if (vals == null || vals.isEmpty() || vals.get(0) == null) return null;
        TreeNode root = new TreeNode(vals.get(0));
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int i = 1;
        while (i < vals.size()) {
            TreeNode node = q.poll();
            Integer v = vals.get(i++);
            if (v != null) { node.left = new TreeNode(v); q.offer(node.left); }
            if (i < vals.size()) {
                v = vals.get(i++);
                if (v != null) { node.right = new TreeNode(v); q.offer(node.right); }
            }
        }
        return root;
    }

    public static TreeNode findNode(TreeNode root, int val) {
        TreeNode cur = root;
        while (cur != null) {
            if (val == cur.val) return cur;
            cur = val < cur.val ? cur.left : cur.right;
        }
        return null;
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(6,2,8,0,4,7,9,null,null,3,5);
        TreeNode root = buildTree(arr);
        TreeNode p = findNode(root, 2);
        TreeNode q = findNode(root, 8);
        System.out.println(lowestCommonAncestor(root, p, q).val);
        System.out.println(lowestCommonAncestor(root, findNode(root,2), findNode(root,4)).val);
    }
}