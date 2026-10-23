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

// class Solution { //O(n)  //withGlobal variable
//     int maxDia;
//      public int diameterOfBinaryTree(TreeNode root) {
//       maxDia=0;
//       levels(root);
//       return maxDia;
//      }

//      public int levels(TreeNode root)
//      {
//         if(root==null) return 0;
//         int leftLevels=levels(root.left);
//         int rightLevels=levels(root.right);
//         int dia=leftLevels+rightLevels;
//         maxDia=Math.max(dia,maxDia);
//         return 1+Math.max(leftLevels,rightLevels);
//      }
// }

class Solution { //O(n)  //without Global variable
    
     public int diameterOfBinaryTree(TreeNode root) {
      int[] maxDia={0};
      levels(root,maxDia);
      return maxDia[0];
     }

     public int levels(TreeNode root,int[] maxDia)
     {
        if(root==null) return 0;
        int leftLevels=levels(root.left,maxDia);
        int rightLevels=levels(root.right,maxDia);
        int dia=leftLevels+rightLevels;
        maxDia[0]=Math.max(dia,maxDia[0]);
        return 1+Math.max(leftLevels,rightLevels);
     }
}