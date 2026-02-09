/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
import java.util.*;

class Solution {
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> vals = new ArrayList<>();
        inorder(root, vals);
        return build(vals, 0, vals.size() - 1);
    }

    void inorder(TreeNode n, List<Integer> v) {
        if (n == null) return;
        inorder(n.left, v);
        v.add(n.val);
        inorder(n.right, v);
    }

    TreeNode build(List<Integer> v, int l, int r) {
        if (l > r) return null;
        int m = (l + r) / 2;
        TreeNode n = new TreeNode(v.get(m));
        n.left = build(v, l, m - 1);
        n.right = build(v, m + 1, r);
        return n;
    }
}
