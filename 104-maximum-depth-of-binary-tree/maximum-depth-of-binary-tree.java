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
class Solution {
    public int maxDepth(TreeNode root) {
        return maxValue(root);
    }

    private int maxValue(TreeNode root)
    {
        if(root == null) return 0;

        // int left = maxValue(root.left)+1;
        // int right = maxValue(root.right)+1;

        return Math.max(maxValue(root.left),maxValue(root.right))+1;
    }
}