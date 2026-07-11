class Solution {
    public int missingNumber(int[] nums) {
        // int n=nums.length;  by sum 
        // int sum=(n*(n+1))/2;
        // int cal=0;
        // for(int i=0;i<n;i++)
        // {
        //     cal+=nums[i];
        // }
        // return sum-cal;


        // int n=nums.length;   //extra space
        // boolean[] b=new boolean[n+1];
        // for(int ele:nums)
        // {
        //     b[ele]=true;
        // }
        // for(int i=0;i<=n;i++)
        // {
        //     if(b[i]==false) return i;
        // }

        // return 0;

        int n=nums.length;
        int i=0;
        while(i<n)
        {
           
            if(nums[i]==i || nums[i]==n)
            {
            i++;
            }
            else
            {
                swap(i,nums[i],nums);
            }
        }
        for(i=0;i<n;i++)
        {
            if(nums[i]!=i) return i;
        }
        return i;
    }
    public void swap(int i,int j,int[] nums)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}