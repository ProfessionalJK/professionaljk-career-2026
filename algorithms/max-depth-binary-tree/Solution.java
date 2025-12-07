class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x) {val = x;}
}

public class Solution {

    public static void main(String[] args) {
        TreeNode node = new TreeNode(3);
        node.left = new TreeNode(9);
        node.right = new TreeNode(20);
        node.right.left = new TreeNode(15);
        node.right.right = new TreeNode(7);
        System.out.println(maxDepthBinaryTree(node));
    }

    public static int maxDepthBinaryTree(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepthBinaryTree(root.left), maxDepthBinaryTree(root.right));
    }
}