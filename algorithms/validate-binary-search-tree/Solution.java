class TreeNode {
    long val;
    TreeNode left, right;
    TreeNode(int x) { val = x; }
}

public class Solution {

    public static boolean isValidBST(TreeNode root) {
       return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public static boolean helper(TreeNode node, Long minExclusive, Long maxExclusive) {
        if (node == null) return true;
        if (!(minExclusive < node.val && node.val < maxExclusive)) return false;
        return helper(node.left, minExclusive, node.val) && helper(node.right, node.val, maxExclusive);
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(5);
        node.left = new TreeNode(3);
        node.left.left = new TreeNode(1);
        node.left.right = new TreeNode(4);
        node.right = new TreeNode(9);
        node.right.left = new TreeNode(7);
        node.right.right = new TreeNode(10);
        System.out.println(isValidBST(node));
    }
}