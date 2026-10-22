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
// class Solution {  //with recursion
//     public List<Integer> inorderTraversal(TreeNode root) {
//         List<Integer> ans=new ArrayList<>();
//         inorder(root,ans);
//         return ans;
//     }

//     public void inorder(TreeNode root,List<Integer> ans)
//     {
//         if(root==null) return;  //base case
//         inorder(root.left,ans);
//         ans.add(root.val);
//         inorder(root.right,ans);
//     }
// }

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        Stack<TreeNode> st=new Stack<>();
        TreeNode temp=root;
        while(true)
        {
            if(temp!=null)
            {
                st.push(temp);
                temp=temp.left;
            }
            else
            {
                if(st.isEmpty()) break;
               TreeNode top=st.pop();
               ans.add(top.val);
               temp=top.right; 
            }
        }
        return ans;
    }
}