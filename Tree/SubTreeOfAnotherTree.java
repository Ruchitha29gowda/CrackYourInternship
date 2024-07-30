package Tree;

public class SubTreeOfAnotherTree {
    
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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null) return false;
        if(root.val == subRoot.val){
            System.out.println(root.val);
            if(helper(root , subRoot)){
                return true;
            }
        }

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public boolean helper(TreeNode root, TreeNode subRoot){
        if(root==null && subRoot == null) return true;
        if(root==null || subRoot == null || root.val!=subRoot.val) return false;

        if(!helper(root.left , subRoot.left)) return false;
        if(!helper(root.right , subRoot.right)) return false;

        return true;
    }
}