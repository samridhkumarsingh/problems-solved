class Solution {
    public int longestSubarray(int[] nums) {
        int right=0,left=0;
        int n=nums.length;
        int c=0,max=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        
        while(right<n)
        {
            if(map.containsKey(nums[right]))
            {
                c=right-left-1;
                max=Math.max(c,max);
                left=map.get(nums[right])+1;
            }
            if(nums[right]==0)
            {
                map.put(nums[right],right);
            }
            right++;
        }
        c=right-left-1;
        max=Math.max(c,max);

        return max;
    }
}