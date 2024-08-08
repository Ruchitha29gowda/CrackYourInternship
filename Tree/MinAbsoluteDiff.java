package Tree;

public class MinAbsoluteDiff {
    
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
    public int getMinimumDifference(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        inorder(list, root);
        int min = list.get(1)-list.get(0);
        for(int i=0; i<list.size()-1; i++){
            System.out.print(list.get(i+1)-list.get(i)+"   ");
            if(min>list.get(i+1)-list.get(i)) min = list.get(i+1)-list.get(i);
        }
        System.out.println("\n"+list);
        return min;
    }

    public static void inorder(ArrayList<Integer> l, TreeNode root){
        if(root==null) return ;
        inorder(l, root.left);
        l.add(root.val);
        inorder(l, root.right);
    }
}