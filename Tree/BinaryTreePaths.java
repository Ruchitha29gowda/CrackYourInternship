package Tree;

public class BinaryTreePaths {
    
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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        rootToLeaf(root, l, res);

        return res;
    }

    public void rootToLeaf(TreeNode root, List<Integer> l, List<String> res){
        if(root==null) return;

        l.add(root.val);
        if(root.left==null && root.right==null){
            buildResult(l, res);
        }
        rootToLeaf(root.left, l, res);
        rootToLeaf(root.right, l, res);
        l.remove(l.size()-1);
    }

    public void buildResult(List<Integer> l, List<String> res){
        if(l.size()!=0){
            String s = "";
            for(int i=0; i<l.size()-1; i++){
                s+=Integer.toString(l.get(i))+"->";
            }
            s+=Integer.toString(l.get(l.size()-1));
            res.add(s);
        }
    }

    
}