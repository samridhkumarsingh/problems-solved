class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxavg=Integer.MIN_VALUE;
         double sum=0;
        double avg=0;
        for(int r=0;r<nums.length;r++)
        {
            sum+=nums[r];
            if(r>=k-1)
            {
                avg=sum/k;
                maxavg=Math.max(maxavg,avg);
                sum-=(nums[r-k+1]); //removing left element;
            }
        }
        return maxavg;
    }
}