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

 
// class Solution {  //using one helper function

//     public TreeNode invertTree(TreeNode root) {
//        invert(root);
//        return root;       
//     }

//     public void invert(TreeNode root)
//     {
//         if(root==null) return;
//         if(root.left==null && root.right==null) return;
//         TreeNode temp;
//         temp=root.left;
//         root.left=root.right;
//         root.right=temp;
//         invert(root.left);
//         invert(root.right);
//     }
// }

class Solution { 

    public TreeNode invertTree(TreeNode root) {
        if(root==null) return root;
        if(root.left==null && root.right==null) return root;
        TreeNode temp;
        temp=root.left;
        root.left=root.right;
        root.right=temp;
        invertTree(root.left);
        invertTree(root.right);
       return root;       
    }
}