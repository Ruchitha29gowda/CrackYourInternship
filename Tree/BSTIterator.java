package Tree;

public class BSTIterator {
    
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
class BSTIterator {
    public static Stack<TreeNode> st ;
    public BSTIterator(TreeNode root) {
        st = new Stack<>();
        leftTraversal(root);
    }

    public void leftTraversal(TreeNode root){
        if(root==null) return ;
        st.push(root);
        leftTraversal(root.left);
    }
    
    public int next() {
        
        TreeNode v = st.pop();
        if(v.right!=null){
            leftTraversal(v.right);
        }

        return v.val;

    }
    
    public boolean hasNext() {
        if(st.isEmpty()) return false;
        return true;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */