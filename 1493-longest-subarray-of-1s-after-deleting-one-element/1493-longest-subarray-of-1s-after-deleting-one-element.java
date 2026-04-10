class Solution {
    public int longestSubarray(int[] nums) {
        // int right=0,left=0;
        // int n=nums.length;
        // int c=0,max=0;
        // HashMap<Integer,Integer> map=new HashMap<>();
        
        // while(right<n)
        // {
        //     if(map.containsKey(nums[right]))
        //     {
        //         c=right-left-1;
        //         max=Math.max(c,max);
        //         left=map.get(nums[right])+1;
        //     }
        //     if(nums[right]==0)
        //     {
        //         map.put(nums[right],right);
        //     }
        //     right++;
        // }
        // c=right-left-1;
        // max=Math.max(c,max);

        // return max;

        int right=0,left=0;
        int n=nums.length;
        int c=0,max=0;
        int noZero=0;
        while(right<n)
        {
            if(nums[right]==0) noZero++;
            while(noZero>1)
            {
                if(nums[left]==0) noZero--;
                left++;
            }
             c=right-left;
             max=Math.max(c,max);
             right++;

        }
        return max;
    }
}