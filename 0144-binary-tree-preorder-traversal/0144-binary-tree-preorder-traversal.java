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
// class Solution {
//     List<Integer> ans;  // make it global 
//     public List<Integer> preorderTraversal(TreeNode root) {
//         ans=new ArrayList<>();
//         preorder(root);
//         return ans;
//     }
//      public void preorder(TreeNode root)
//     {
//         if(root==null) return; //Base case
//         ans.add(root.val);
//         preorder(root.left); //Left subtree
//         preorder(root.right); //right subtree
//     }
// }

class Solution {  //without recursion
    public List<Integer> preorderTraversal(TreeNode root) {
       List<Integer> ans=new ArrayList<>();
       Stack<TreeNode> st=new Stack<>();
       if(root!=null) st.push(root);
       while(st.size()>0)
       {
        TreeNode top=st.pop();
        ans.add(top.val);
        if(top.right!=null) st.push(top.right);
         if(top.left!=null) st.push(top.left);
       }
       return ans;
    }
}