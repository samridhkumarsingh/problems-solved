class Solution {
        public void swap(int i,int j,int[] nums)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
        int i=0;
        while(i<n)
        {
            if(nums[i]==i+1||nums[i]==nums[nums[i]-1])
            {
                i++;
            }
            else{
                swap(i,nums[i]-1,nums);
            }
        }
        int[] ans=new int[2];
        for(i=0;i<n;i++)
        {
            if(nums[i]!=i+1)
            {
                ans[0]=nums[i];
                ans[1]=i+1;
                break;
            }
        }
        return ans;
    }
}