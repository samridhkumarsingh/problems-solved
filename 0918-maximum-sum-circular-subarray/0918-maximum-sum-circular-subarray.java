// class Solution {
//     public int maxSubarraySumCircular(int[] nums) {
//         int nsum=0;
//         int tsum=0;
//         int msum=0;
//         int max=Integer.MIN_VALUE;
//         int min=Integer.MAX_VALUE;
//         for(int i=0;i<nums.length;i++)
//         {
//             tsum+=nums[i];
//             nsum+=nums[i];
//               if(nsum>0) nsum=0;  //wrong  because negative zero bn ja rha hai
//             msum+=nums[i];
//             min=Math.min(min,nsum);
//             max=Math.max(max,msum);
//             // if(nsum>0) nsum=0;
//             if(msum<0) msum=0;
//         }
//         int ans=Math.max(max,(tsum-min));
//         return ans;
//     }
// }

class Solution {
    public int maxSubarraySumCircular(int[] nums) {

        int total = 0;

        int currentMax = 0;
        int maxSum = Integer.MIN_VALUE;

        int currentMin = 0;
        int minSum = Integer.MAX_VALUE;

        for (int num : nums) {

            // Normal Kadane
            currentMax = Math.max(num, currentMax + num);
            maxSum = Math.max(maxSum, currentMax);

            // Minimum Kadane
            currentMin = Math.min(num, currentMin + num);
            minSum = Math.min(minSum, currentMin);

            // Total sum
            total += num;
        }

        // All numbers are negative
        if (maxSum < 0) {
            return maxSum;
        }

        // Maximum of:
        // 1. Normal subarray
        // 2. Circular subarray
        return Math.max(maxSum, total - minSum);
    }
}