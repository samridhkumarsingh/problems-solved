// class Solution {
//     public int[] rearrangeArray(int[] nums) {
//         int p=0,n=1;
//        while(p<nums.length && n<nums.length)
//        {
//         if(nums[p]>=0) p+=2;
//         if(nums[n]<0)n+=2;
//         if((p<nums.length && n<nums.length)&&(nums[p]<0 && nums[n]>=0))
//         {
//             int temp=nums[p];
//             nums[p]=nums[n];
//             nums[n]=temp;
//         }
//        }
//        return nums;
//     }
// }
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int e=0,o=1;
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0)
            {
                arr[e]=nums[i];
                e+=2;
            }
            else
            {
                arr[o]=nums[i];
                o+=2;
            }
      
        }
        return arr;
        // for(int i=0;i<nums.length;i++)
        // {
        //     nums[i]=arr[i];
        // }
        // return nums;
    }
}