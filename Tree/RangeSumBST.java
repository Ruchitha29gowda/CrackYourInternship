package Tree;

public class RangeSumBST {
    
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
    static int sum =0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        sum =0;
        inorder(root, low, high);
        return sum;
        
    }

    public static void inorder(TreeNode root, int low, int high){
        System.out.print(sum+"  ");
        if(root==null) return ;
        inorder( root.left, low, high);
        inorder( root.right, low, high);
        if(root.val<=high && root.val>=low){
            sum+=root.val;
        }
    }
}