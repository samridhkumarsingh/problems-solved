class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n=nums.length;
        // for(int i=0;i<n-1;i++)//bubble sort
        // {
        //     for(int j=0;j<n-1-i;j++)
        //     {
        //         if(nums[j]%2!=0)
        //         {
        //             int temp=nums[j];
        //             nums[j]=nums[j+1];
        //             nums[j+1]=temp;
        //         }
        //     }
        // }
        // return nums;
        int p=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]%2==0)
            {
                int temp=nums[i];
                nums[i]=nums[p];
                nums[p]=temp;
                p++;
            }
        }

        return nums;
    }
}