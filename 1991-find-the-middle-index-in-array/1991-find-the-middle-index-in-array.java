class Solution {
    public int findMiddleIndex(int[] nums) {
        int n=nums.length;
        int[] presum=new int[n];
        presum[0]=nums[0];
        for(int i=1;i<n;i++)
        {
          presum[i] = presum[i-1] + nums[i];
        }
      
        for(int i=0;i<n;i++)
        {   
            int leftsum=0, rightsum=presum[n-1]-presum[i];
            if(i==0) leftsum=0;
            else if(i==n-1) 
            {
                rightsum=0;
                leftsum=presum[i-1];
            }
            else
            { 
                leftsum=presum[i-1];
                rightsum=presum[n-1]-presum[i];
            }

            if(leftsum==rightsum) return i;
        }

        return -1;
    }
}