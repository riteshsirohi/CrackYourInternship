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
    private int Height(TreeNode root){
        if(root==null){
            return 0;
        }
        int lh=Height(root.left);
        int rh=Height(root.right);

        return 1+Math.max(lh,rh);
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        int lh=Height(root.left);
        int rh=Height(root.right);
       
       if(Math.abs(lh-rh)<=1 && isBalanced(root.left) && isBalanced(root.right)){
           return true;
       }
       return false;

    }
}