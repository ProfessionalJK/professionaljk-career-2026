class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x) {val = x;}
}

public class Solution {

    public static void main(String[] args) {
        TreeNode node = new TreeNode(5);
        node.left = new TreeNode(1);
        node.right = new TreeNode(4);
        node.right.left = new TreeNode(3);
        node.right.right = new TreeNode(6);
        System.out.println(validateBst(node));
    }

    public static boolean validateBst(TreeNode root) {
        return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public static boolean helper(TreeNode node, long minExclusive, long maxExclusive) {
        if (node == null) return true;
        long val = node.val;
        if (val <= minExclusive || val >= maxExclusive) return false;
        return helper(node.left, minExclusive, val) && helper(node.right, val, maxExclusive);
    }
}