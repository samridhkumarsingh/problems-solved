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
    List<Integer> ans;  // make it global 
    public List<Integer> preorderTraversal(TreeNode root) {
        ans=new ArrayList<>();
        preorder(root);
        return ans;
    }
     public void preorder(TreeNode root)
    {
        if(root==null) return; //Base case
        ans.add(root.val);
        preorder(root.left); //Left subtree
        preorder(root.right); //right subtree
    }
}