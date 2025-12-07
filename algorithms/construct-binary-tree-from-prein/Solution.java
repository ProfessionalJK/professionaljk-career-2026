import java.util.*;
class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int v){val=v;}
}

public class Solution {

    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null || preorder.length != inorder.length) return null;
        Map<Integer,Integer> idx = new HashMap<>();
        for (int i=0;i<inorder.length;i++) idx.put(inorder[i], i);
        return helper(preorder, 0, preorder.length-1, inorder, 0, inorder.length-1, idx);
    }

    public static TreeNode helper(int[] pre, int pl, int pr, int[] in, int il, int ir, Map<Integer,Integer> idx) {
        if (pl > pr || il > ir) return null;
        int rootVal = pre[pl];
        TreeNode root = new TreeNode(rootVal);
        int inRoot = idx.get(rootVal);
        int leftSize = inRoot - il;
        root.left = helper(pre, pl+1, pl+leftSize, in, il, inRoot-1, idx);
        root.right = helper(pre, pl+leftSize+1, pr, in, inRoot+1, ir, idx);
        return root;
    }

    public static List<Integer> toLevelOrder(TreeNode root) {
        List<Integer> out = new ArrayList<>();
        if (root == null) return out;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            TreeNode n = q.poll();
            if (n == null) { out.add(null); continue; }
            out.add(n.val);
            q.offer(n.left); q.offer(n.right);
        }

        int last = out.size()-1;
        while (last>=0 && out.get(last)==null) last--;
        return out.subList(0, last+1);
    }

    public static void main(String[] args) {
        int[] pre = {3,9,20,15,7};
        int[] in =  {9,3,15,20,7};
        TreeNode root = buildTree(pre,in);
        System.out.println(toLevelOrder(root));
    }
}