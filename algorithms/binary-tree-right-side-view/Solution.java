import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x) {this.val = x;}
}

public class Solution {

    public static List<Integer> rightSideViewOfDFS(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        dfs(root, 0, result);
        return result;
    }

    public static void dfs(TreeNode node, int level, List<Integer> result) {
        if (node == null) return;
        if (level == result.size()) {
            result.add(node.val);
        }
        dfs(node.right, level + 1, result);
        dfs(node.left, level + 1, result);
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.left.left = new TreeNode(4);

        System.out.println(rightSideViewOfDFS(node));
    }
}