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
// class Solution {  //wrong answer
//     public int diameterOfBinaryTree(TreeNode root) {
//         if(root==null) return 0;
//         return levels(root.left)+levels(root.right);
//     }

//     public int levels(TreeNode root)
//     {
//         if(root==null) return 0;
//         return 1+Math.max(levels(root.left),levels(root.right));
//     }
// }

// class Solution { //O(n2)

//      public int diameterOfBinaryTree(TreeNode root) {
//         if(root==null) return 0;
//         int myDia=levels(root.left)+ levels(root.right);
//         int leftDia=diameterOfBinaryTree(root.left);
//         int rightDia=diameterOfBinaryTree(root.right);
//         return Math.max(myDia,Math.max(leftDia,rightDia));
//      }

//      public int levels(TreeNode root)
//      {
//         if(root==null) return 0;
//         return 1+Math.max(levels(root.left),levels(root.right));
//      }
// }

class Solution { //O(n)
    int maxDia;
     public int diameterOfBinaryTree(TreeNode root) {
      maxDia=0;
      levels(root);
      return maxDia;
     }

     public int levels(TreeNode root)
     {
        if(root==null) return 0;
        int leftLevels=levels(root.left);
        int rightLevels=levels(root.right);
        int dia=leftLevels+rightLevels;
        maxDia=Math.max(dia,maxDia);
        return 1+Math.max(leftLevels,rightLevels);
     }
}