class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> Map= new HashMap<>();
        int sum=0,c=0;
        Map.put(0,1);
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            if(Map.containsKey(sum-k))
            {
                c+=Map.get(sum-k);
            }
            Map.put(sum,Map.getOrDefault(sum,0)+1);
        }
        return c;
    }
}