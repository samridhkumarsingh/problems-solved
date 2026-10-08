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
//     public int levels(TreeNode root)
//     {
//         if(root==null) return 0;
//         return 1+Math.max(levels(root.left),levels(root.right));
//     }
//     public List<Integer> nThLevel(TreeNode root,int level,int lvl)
//     {
//         List<Integer> array=new ArrayList<>();
//         // List<Integer> array;
//         if(root==null) return array;
//         if(level==lvl)
//         {  
//             array.add(root.val);
//             return array;
//         }
//        array.addAll( nThLevel(root.left,level+1,lvl));  //we have to use addAll function in it
//        array.addAll( nThLevel(root.right,level+1,lvl));
//         return array;
//     }
//     public List<List<Integer>> levelOrder(TreeNode root) {
//         List<List<Integer>> ans=new ArrayList<>();
//         int lvl=levels(root);

//         for(int i=0;i<=lvl-1;i++)
//          {
//           // array=new ArrayList<>();
//            ans.add(nThLevel(root,0,i));
//         }
//         return ans;
//     }
// }

class Solution {
    public int levels(TreeNode root)
    {
        if(root==null) return 0;
        return 1+Math.max(levels(root.left),levels(root.right));
    }
    public void nThLevel(TreeNode root,int level,int lvl,List<Integer> array)
    {
      
        if(root==null) return;
        if(level==lvl) array.add(root.val);
         nThLevel(root.left,level+1,lvl,array); 
         nThLevel(root.right,level+1,lvl,array);
     
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        int lvl=levels(root);

        for(int i=0;i<=lvl-1;i++)
         {
         List<Integer> array=new ArrayList<>();
           nThLevel(root,0,i,array);
           ans.add(array);
        }
        return ans;
    }
}