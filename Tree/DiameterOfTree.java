package Tree;

public class DiameterOfTree {
    
}

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
    public int diameterOfBinaryTree(TreeNode root) {
        return dia(root)-1;
    }

    public static int dia(TreeNode root){
        if(root==null) return 0;

        int lHeight = height(root.left);
        int rHeight = height(root.right);

        int self = lHeight + rHeight + 1;
        int lD = dia(root.left);
        int rD = dia(root.right);

        return Math.max(self, Math.max(lD, rD));
    }

    public static int height(TreeNode root){
        if(root== null) return 0;
        return Math.max(height(root.left), height(root.right))+1;
    }

    
}