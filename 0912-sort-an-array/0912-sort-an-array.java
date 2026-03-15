class Solution {
    public int[] sortArray(int[] nums) {
        int n=nums.length;
        // for(int i=0;i<n-1;i++)  //bubble sort
    //     {
    //         boolean flag=true;
    //         for(int j=0;j<n-1-i;j++)
    //         {
    //             if(nums[j]>nums[j+1])
    //             {
    //                 int temp=nums[j];
    //                 nums[j]=nums[j+1];
    //                 nums[j+1]=temp;
    //                 flag=false;           
    //             }

    //         }
    //         if(flag==true) break;
    //     }
    //     return nums;
    

    for(int i=1;i<n;i++) //inserction sort
    {
        int curr=nums[i];
        int p=i-1;
        while(p>=0 && nums[p]>curr)
        {
            nums[p+1]=nums[p];
            p--;
        }
        nums[p+1]=curr;
    }
    return nums;
    }
}