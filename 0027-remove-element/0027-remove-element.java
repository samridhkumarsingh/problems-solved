class Solution {
    public int removeElement(int[] nums, int val) {
        // int n=nums.length;
        // int nval=0;
        // for(int ele: nums)
        // {
        //     if(ele==val) nval++;
        // }

        // for(int x=0;x<nval;x++)
        // {
        //     for(int i=0;i<n-1-x;i++)
        //     {
        //         if(nums[i]==val)
        //         {
        //             int temp=nums[i];
        //             nums[i]=nums[i+1];
        //             nums[i+1]=temp;
        //         }
        //     }
        // }
        // return n-nval;

         int n=nums.length;
         int pos=0;
         for(int i=0;i<n;i++)
         {
            if(nums[i]!=val)
            {
                int temp=nums[pos];
                nums[pos]=nums[i];
                nums[i]=temp;
                pos++;
            }
         }

         return pos;
    }
}