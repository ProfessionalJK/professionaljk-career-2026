import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x) { val = x; }
}

public class Solution {

    public static boolean hasPathSum(TreeNode root, int target) {
        if (root == null) return false;
        return dfs(root, 0, target);
    }
    public static boolean dfs(TreeNode node, int sum, int target) {
        if (node == null) return false;
        sum += node.val;
        if (node.left == null && node.right == null) return sum == target;
        return dfs(node.left, sum, target) || dfs(node.right, sum, target);
    }

    public static TreeNode buildTree(List<Integer> vals) {
        if (vals == null || vals.isEmpty() || vals.get(0) == null) return null;
        TreeNode root = new TreeNode(vals.get(0));
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int i=1;
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

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(5,4,8,11,null,13,4,7,2,null,null,null,1);
        TreeNode root = buildTree(arr);
        System.out.println(hasPathSum(root, 22));
    }
}
