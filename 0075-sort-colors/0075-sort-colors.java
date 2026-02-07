class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;      //method 1
        int noOfZeros=0,noOfOne=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==0)
            {
                noOfZeros++;
            }
            else if(nums[i]==1)
            {
                noOfOne++;
            }
        }
        for(int i=0;i<n;i++)
        {
            if(i<noOfZeros)
            {
                nums[i]=0;
            }
            else if(i<noOfZeros+noOfOne)
            {
                nums[i]=1;
            }
            else
            {
                nums[i]=2;
            }
        }
        
    }
}