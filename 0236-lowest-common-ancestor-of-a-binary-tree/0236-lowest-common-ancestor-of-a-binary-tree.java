/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p==root ||q==root) return root;
        //does 'p' ;ie in lst
        boolean pLiesInLST=check(root.left,p);
        boolean qLiesInLST=check(root.left,q);
        // if(pLiesInLST==true && qLiesInLST==false) return root;
        // if(pLiesInLST==false && qLiesInLST==true) return root;
        if(pLiesInLST==true && qLiesInLST==true) return lowestCommonAncestor(root.left,p,q);
         if(pLiesInLST==false && qLiesInLST==false) return lowestCommonAncestor(root.right,p,q);
         else return root;
    }
    public boolean check(TreeNode root, TreeNode x)
    {
        if(root==null) return false;
        if(root==x) return true;
        return check(root.left,x)|| check(root.right,x);
    }
}