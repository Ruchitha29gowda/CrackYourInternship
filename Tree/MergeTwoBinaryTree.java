public class MergeTwoBinaryTree {
    
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
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        root1 = helper(root1, root2);
        System.out.println();
        // printLL(root1);
        return root1;
    }

    public TreeNode helper(TreeNode root1, TreeNode root2){
        if(root1==null && root2==null) return root1;
        if(root1==null){
            System.out.print("null   ");
            root1=root2;
            System.out.print(root1.val+" ");
            return root1;
        }
        else if(root2==null){
            System.out.print(root1.val+" ");
            return root1;
        }

        root1.val = root1.val + root2.val;
        System.out.print(root1.val+" ");
        root1.left = helper(root1.left, root2.left);
        root1.right = helper(root1.right, root2.right);
        return root1;
    }

    // public void printLL(TreeNode root1){ 
    //     if(root1==null) return;
    //     System.out.print(root1.val+" ");
    //     printLL(root1.left);
    //     printLL(root1.right);
    // }
}