class Solution {
    public int maxOperations(int[] nums, int k) {
        // Arrays.sort(nums);
        // int p=0,q=nums.length-1;
        // int c=0;
        // while(p<q)
        // {
        //     if(nums[p]+nums[q]==k)
        //     {
        //         c++;
        //         p++;
        //         q--;
        //     }
        //     else if(nums[p]+nums[q]<k)
        //     {
        //         p++;
        //     }
        //     else
        //     {
        //         q--;
        //     }
        // }
        // return c;

        int c=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int ele:nums)
        {
            if(map.containsKey(k-ele)&& map.get(k-ele)>0)
            {
                c++;
                map.put(k-ele,map.get(k-ele)-1);
            }
            else
            {
                map.put(ele,map.getOrDefault(ele,0)+1);
            }
        }
        return c;
    }
}