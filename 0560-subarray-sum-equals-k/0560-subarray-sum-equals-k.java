class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> Map=new HashMap<>();
        Map.put(0,1);
        int sum=0;
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            int rem=(sum-k);
            if(Map.containsKey(rem))
            {
                count+=Map.get(rem);
            }
            Map.put(sum,Map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}