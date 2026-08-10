class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int left=0;
        HashSet<Integer> set=new HashSet<>();
        long maxsum=0;
        long sum=0;
      for(int rg=0;rg<nums.length;rg++)
      {
        while(set.contains(nums[rg]))
        {
            set.remove(nums[left]);
            sum-=nums[left];
            left++;
        }
         sum+=nums[rg];
         set.add(nums[rg]);
        if(rg-left+1==k)
        {
            maxsum=Math.max(maxsum,sum);
            set.remove(nums[left]);  //making space for the left one
            sum-=nums[left];
            left++;
        }
      }
        return maxsum;
    }
}