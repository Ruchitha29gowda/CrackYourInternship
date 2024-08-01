package Tree;

public class PathSum {
    
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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        if(root.left!=null && helper(root.left, targetSum, root.val)){
            return true;
        }

        if(root.right!=null && helper(root.right, targetSum, root.val)){
            return true;
        }

        if(root.right==null && root.left==null){
            if(root.val == targetSum) return true;
        }

        return false;
    }

    public boolean helper(TreeNode root, int targetSum, int count){
        if(root==null){
            if(count==targetSum) return true;
            else return false;
        }

        if(helper(root.left, targetSum, count+ root.val)){
            return true;
        }
        if(helper(root.right, targetSum, count+ root.val)){
            return true;
        }
        return false;
    }
}