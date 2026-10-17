class Solution {
    public int removeDuplicates(int[] nums) {
        int p=0,q=1;
        while(q<nums.length)
        {
            if(nums[p]!=nums[q])
            {
                nums[p+1]=nums[q];
                p++;
            }
           q++;  
        }
        return p+1;
    }
}
// class Solution {
//     public int removeDuplicates(int[] nums) {
//         int k=1;
//         for(int i=0;i<nums.length-1;i++)
//         {
//             if(nums[i]!=nums[i+1])
//             {
//                 nums[k]=nums[i+1];
//                 k++;
//             }
//         }
//         return k;
//     }
// }