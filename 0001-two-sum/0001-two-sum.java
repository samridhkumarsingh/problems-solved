class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        HashMap<Integer,Integer>hm=new HashMap<>();
        
        for(int i=0;i<n;i++)
        {
            int a=nums[i];
            int more=target-a;
            if(hm.containsKey(more))
            {
                 return new int[] { hm.get(more), i };
            }
            hm.put(a,i);
        }
       return new int[] {};
    }
}