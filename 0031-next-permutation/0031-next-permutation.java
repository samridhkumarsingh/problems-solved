class Solution {
    public void nextPermutation(int[] nums) {
        int index=-1;
        int n=nums.length;
        for(int i=n-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
                index=i;
                break;
            }
        }
        if(index==-1)
        {
            Arrays.sort(nums);
            return;
        }
        //get the no. greater then index
        for(int i=n-1;i>index;i--)
        {
            if(nums[i]>nums[index])
            {
                int temp=nums[i];
                nums[i]=nums[index];
                nums[index]=temp;
                break;
            }
            
        }
        //reverse the rest element to make them shorter
        int left=index+1;
        int right=n-1;
        while(left<right)
        {
             int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
            left++;
            right--;
        }
    }
}