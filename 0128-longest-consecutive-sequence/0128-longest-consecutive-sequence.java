class Solution {
    public int longestConsecutive(int[] nums) {
        // int lng=0;
        // int count=1;
        // if(nums.length==0) return 0;
        // int lastmin=Integer.MIN_VALUE;
        // Arrays.sort(nums);
        // for(int i=0;i<nums.length;i++)
        // {
        //     if(nums[i]-1==lastmin)
        //     {
        //         count++;
        //         lastmin=nums[i];
        //     }
        //     else if(nums[i]-1!=lastmin && nums[i]!=lastmin)
        //     {
        //         lastmin=nums[i];
        //         lng=Math.max(lng,count);
        //         count=1;
        //     }
        // }
        // lng=Math.max(lng,count);
        // return lng;
        HashSet <Integer> keys=new HashSet<>();
        int lng=0;
        for(int i:nums)
        {
            keys.add(i);
        }
        for(int i:keys)
        {
            if(!keys.contains(i-1))
            {
                int count=1;
                int curr=i;
                while(keys.contains(curr+1))
                {
                    count++;
                    curr++;
                }
                lng=Math.max(count,lng);
            }
           
        }
         return lng;
    }
}