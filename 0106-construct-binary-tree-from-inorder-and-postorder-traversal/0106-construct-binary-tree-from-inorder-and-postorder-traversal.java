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
     public TreeNode helper(int[] inorder, int[] postorder,int inlo,int inhi,int poslo ,int poshi) {
         if(inlo>inhi || poslo>poshi) return null;
        TreeNode root=new TreeNode(postorder[poshi]); //postorder=left right root;
       
       // int r=0; why checking from 0 always
       int r=inlo;
        while(inorder[r]!=postorder[poshi]) r++;
        int leftsize=r-inlo;
        root.left=helper(inorder,postorder,inlo,r-1,poslo,poslo+leftsize-1);
        root.right=helper(inorder,postorder,r+1,inhi,poslo+leftsize,poshi-1);
        return root;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n=inorder.length;
        return helper(inorder,postorder,0,n-1,0,n-1);
    }
}