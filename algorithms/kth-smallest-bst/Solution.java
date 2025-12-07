import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int v){ this.val = v; }
}

public class Solution {
    public static int kthSmallest(TreeNode root, int k) {
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode curr = root;
        int cnt = 0;
        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            cnt++;
            if (cnt == k) return curr.val;
            curr = curr.right;
        }
        throw new IllegalArgumentException("k is out of bounds");
    }

    public static TreeNode buildTree(List<Integer> vals) {
        if (vals == null || vals.isEmpty() || vals.get(0) == null) return null;
        TreeNode root = new TreeNode(vals.get(0));
        Queue<TreeNode> q = new LinkedList<>(); q.offer(root);
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
        TreeNode root = buildTree(Arrays.asList(3,1,4,null,2));
        System.out.println(kthSmallest(root, 1));
        System.out.println(kthSmallest(root, 2));
        System.out.println(kthSmallest(root, 3));
    }
}
